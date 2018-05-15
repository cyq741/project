package com.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import com.demo.service.impl.MyUserDetailsService;

@Configuration
@EnableWebSecurity
public class MySecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Autowired
	MyUserDetailsService userDetailsService;
	@Autowired
	@Qualifier(value="successHandler")
	AuthenticationSuccessHandler successHandler;
	
	@Bean(name="passwordEncoder")
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		/**
		 * 下面的两个配置只要一个就行：
		 * 如果数据库中存储的是明文，使用第一个配置；
		 * 如果使用的是密文，可以只使用第二个配置；
		 * 如果两个配置都使用，则用户在登陆的时候明文和密文都可以生效(后面两种配置效果一样)
		 */
//		auth.userDetailsService(userDetailsService);
		
		auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
//		auth.authenticationProvider(createDaoAuthenticationProvider());//加密
		
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
	
		http.authorizeRequests()
				.antMatchers("/").permitAll()
				.antMatchers("/admin/**").hasRole("ADMIN")
				.antMatchers("/db/**").hasRole("DB")
				.and()
				.csrf().disable()
				.formLogin().loginPage("/login")
				.successHandler(successHandler)
				.and()
				.exceptionHandling()
				.accessDeniedPage("/unAuthorzied");//未授权直接跳转到这个页面
		
	}

//	@Bean
	public DaoAuthenticationProvider createDaoAuthenticationProvider() {
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
		provider.setUserDetailsService(userDetailsService);
		provider.setPasswordEncoder(passwordEncoder());
		
		return provider;
	}
	
}
