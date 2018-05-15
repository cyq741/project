package com.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.demo.bean.MyUserDetails;
import com.demo.bean.User;
import com.demo.bean.UserRole;
import com.demo.service.UserRoleService;
import com.demo.service.UserService;

@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	UserService userService;
	@Autowired
	UserRoleService userRoleService;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		User user = userService.selectByName(username);

		if (user == null) {

			throw new UsernameNotFoundException(username + "is not exist!");
		}
		List<UserRole> roles = userRoleService.selectUserWithRoles(user.getId());

		MyUserDetails myUser = new MyUserDetails();
		myUser.setId(user.getId());
		myUser.setUsername(user.getUsername());
		myUser.setPassword(user.getPassword());
		myUser.setRoles(roles);
		return myUser;
	}

}
