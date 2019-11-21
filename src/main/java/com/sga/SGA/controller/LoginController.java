package com.sga.SGA.controller;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.GrantedAuthority;
import java.util.stream.Collectors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;
import com.sga.SGA.service.LoginService;

import com.sga.SGA.models.Usuario;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import java.util.Date;
import java.util.List;



@CrossOrigin(origins = "http://localhost:8081/#/")
@RestController
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	@PostMapping
	public ResponseEntity<Usuario> Login(@RequestBody Usuario userLogin) {
		
		Usuario user  = null;
		user = loginService.Login(userLogin.getCorreo());
		if(user != null) {
			
			if(encoder.matches(userLogin.getPassword(),user.getPassword())  ) {
				
				if(user.isHabilitado()) {

					user.setToken(getJWTToken(userLogin.getCorreo()));
					user.setPassword(null);
					return new ResponseEntity<Usuario>(user,HttpStatus.ACCEPTED);
				}else {
					return new ResponseEntity<Usuario>(HttpStatus.NOT_FOUND);
				}
				
				
			}else {
				user = null;
				user = new Usuario();
				user.setNombre("contrasena mala");
				return   new ResponseEntity<Usuario>(user,HttpStatus.UNAUTHORIZED);
			}
			
		}else {
			user = null;
			user = new Usuario();
			user.setNombre("nulo");
			return   new ResponseEntity<Usuario>(user,HttpStatus.UNAUTHORIZED);
		}
		
	}
	

	private String getJWTToken(String username) {
		String secretKey = "mySecretKey";
		List<GrantedAuthority> grantedAuthorities = AuthorityUtils
				.commaSeparatedStringToAuthorityList("ROLE_USER");
		
		String token = Jwts
				.builder()
				.setId("softtekJWT")
				.setSubject(username)
				.claim("authorities",
						grantedAuthorities.stream()
								.map(GrantedAuthority::getAuthority)
								.collect(Collectors.toList()))
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + 43200000))
				.signWith(SignatureAlgorithm.HS512,
						secretKey.getBytes()).compact();

		return "Bearer " + token;
	}
}
