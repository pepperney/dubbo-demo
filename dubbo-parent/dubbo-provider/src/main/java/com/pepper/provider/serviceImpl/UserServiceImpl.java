package com.pepper.provider.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.pepper.api.model.user.User;
import com.pepper.api.service.user.UserService;


@Service("userService")
public class UserServiceImpl implements UserService {

	@Override
	public List<User> getAllUsers() {
		List<User> users = new ArrayList<>();
		User user = new User();
		user.setId(1);
		user.setName("张三");
		users.add(user);
		return users;
	}

	@Override
	public User getUserById(Integer arg0) {

		User user = new User();
		user.setId(1);
		user.setName("张三");
		return user;
	}

}
