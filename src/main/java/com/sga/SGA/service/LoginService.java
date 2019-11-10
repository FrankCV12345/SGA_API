package com.sga.SGA.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.sga.SGA.Repository.IUsuaio;
import com.sga.SGA.models.Usuario;
@Service
public class LoginService 
implements UserDetailsService 
{
	@Autowired
	private IUsuaio usarioRepo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		List<GrantedAuthority>  autorities =  new ArrayList<>();
		autorities.add(new SimpleGrantedAuthority("admin"));
		Usuario us = usarioRepo.findByNombre(username);
		UserDetails userDetails =  new User(us.getNombre(),us.getPassword(),autorities);
		return userDetails;
	}
	public Usuario Login(String correoUser) {
		
		return usarioRepo.findByCorreo(correoUser);
	}

}
