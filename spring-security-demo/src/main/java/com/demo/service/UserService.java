package com.demo.service;

import com.demo.bean.User;

public interface UserService {

	User selectByName(String username);
}
