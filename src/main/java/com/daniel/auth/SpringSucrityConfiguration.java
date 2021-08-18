package com.daniel.auth;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SpringSucrityConfiguration extends WebSecurityConfigurerAdapter{
	
	@Override
	public void configure(WebSecurity web) throws Exception {
		// TODO Auto-generated method stub
		web.ignoring().antMatchers("/swagger-ui-custom.html",
				"/api-docs",
				"swagger-resources","/v2/api-docs",
                "/configuration/ui",
                "/swagger-resources/**",
                "/configuration/security",
                "/swagger-ui/**",
                "/webjars/**");
	}
	
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		http
		.csrf().disable()
		.authorizeRequests().antMatchers("/v2/api-docs", "/swagger-resources/configuration/ui", "/swagger-resources", "/swagger-resources/configuration/security", "/swagger-ui-custom.html", "/webjars/**").permitAll()
		.and()
		.authorizeRequests().antMatchers(HttpMethod.OPTIONS,"/**","/swagger-ui-custom.html","/swagger-ui/**").permitAll()
		.anyRequest().authenticated()
		.and()
		.httpBasic();
	}
	
	
	
}
