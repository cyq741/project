package com.demo.bean;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;

public class MyUserDetails extends User implements UserDetails {

	private static final long serialVersionUID = 1L;

	private List<UserRole> roles;

	public List<UserRole> getRoles() {
		return roles;
	}

	public void setRoles(List<UserRole> roles) {
		this.roles = roles;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		if (roles.size() < 1) {
			return AuthorityUtils.commaSeparatedStringToAuthorityList("");
		}

		List<GrantedAuthority> AuthorityList = new ArrayList<GrantedAuthority>();
		System.out.println(this.getClass().getSimpleName() + "=====2================" + roles);
		for (UserRole userRole : roles) {
			System.out.println(this.getClass().getSimpleName() + "===3==" + userRole.getRoles().getRole());
			AuthorityList = AuthorityUtils.createAuthorityList(userRole.getRoles().getRole());
		}

		return AuthorityList;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
