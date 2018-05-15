package com.demo.config;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

/**
 * 自定义登陆成功后重定向的页面
 * 
 * @author cyq
 *
 */
 @Component(value="successHandler")
public class SuccessHandler extends SimpleUrlAuthenticationSuccessHandler {
	/* URL 重定向策略（转向器） */
	private RedirectStrategy redirect = new DefaultRedirectStrategy();

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {
//		System.out.println("============sucessHandler==============");
		Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();

		List<String> roles = new ArrayList<>();

		for (GrantedAuthority a : authorities) {

			roles.add(a.getAuthority());
		}
		String url = "";
		if (roles.contains("ADMIN")) {
			url = "/admin";
		} else if (roles.contains("DB")) {
			url = "/db";
		} else {
			url = "/home";
		}

		redirect.sendRedirect(request, response, url);
	}

	public RedirectStrategy getRedirect() {
		return redirect;
	}

	public void setRedirect(RedirectStrategy redirect) {
		this.redirect = redirect;
	}

}
