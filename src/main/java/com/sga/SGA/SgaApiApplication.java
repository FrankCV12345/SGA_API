package com.sga.SGA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
/*import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.sga.SGA.security.JWTAuthorizationFilter;
*/
@SpringBootApplication
public class SgaApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SgaApiApplication.class, args);
	}
	@Bean
	public RestTemplate resTemplade() {
		return new RestTemplate();
	}
	
	/*
	@EnableWebSecurity
	@Configuration
	class WebSecurityConfig extends WebSecurityConfigurerAdapter {

		@Override
		protected void configure(HttpSecurity http) throws Exception {
			http.csrf().disable()
				.addFilterAfter(new JWTAuthorizationFilter(), UsernamePasswordAuthenticationFilter.class)
				.authorizeRequests()
				.antMatchers(HttpMethod.POST, "/login").permitAll()
				.anyRequest().authenticated();
		}
		
		
		
		@Bean
		public WebMvcConfigurer corConfigurer() {
			return new WebMvcConfigurer() {
				@Override
				public void  addCorsMappings(CorsRegistry cors) {
					cors.addMapping("/**")
					.allowedMethods("GET","POST","PUT","DELETE")
					.allowedHeaders("*")
					.allowedOrigins("*");
					
				}
			};
		}
		
		
		@Bean
		public BCryptPasswordEncoder passwordEndcoder() {
			BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
			return bCryptPasswordEncoder;
		}
		
		
		
		
		
	}*/
}
