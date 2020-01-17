package com.sga.SGA.controller;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.sga.SGA.models.ReCapchaResponse;
import com.sga.SGA.models.Usuario;
import com.sga.SGA.service.LoginService;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@RestController
@RequestMapping("/loginSeguro")
public class LoginSeguroController {

	@Autowired
	private LoginService loginService;
	
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	@Autowired
	private RestTemplate resTemplade;
	
	@PostMapping
	public ResponseEntity<Usuario> Login(@RequestBody Usuario userLogin) {
		
		String url ="https://www.google.com/recaptcha/api/siteverify";
		String params = "?secret=6Ld_UtAUAAAAAAnl4y8l0hdMbVaLKOg2z11pnSls&response="+userLogin.getResponseCaptcha();
		Usuario user  = null;
		
		ReCapchaResponse reCapcha =  resTemplade.exchange(url+params,HttpMethod.POST, null,ReCapchaResponse.class).getBody();
		
		if(reCapcha.getSuccess() != null && reCapcha.getSuccess()) {
			
			user = loginService.Login(userLogin.getCorreo());
			if(user != null) {
				
				if(encoder.matches(userLogin.getPassword(),user.getPassword())) {
					
					if(user.isHabilitado()) {
						user.setToken(getJWTToken(userLogin.getCorreo()));
						user.setPassword(null);
						return new ResponseEntity<Usuario>(user,HttpStatus.ACCEPTED);
					}else {
						return new ResponseEntity<Usuario>(HttpStatus.UNAUTHORIZED);
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
		
		}else {
			System.out.println("Error de captcha : "+reCapcha.getChallenge_ts()+" - "+reCapcha.getHostname());
			return new ResponseEntity<Usuario>(user,HttpStatus.UNAUTHORIZED);
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
