package com.pepper.api.service.user;

import java.util.List;

import com.pepper.api.model.user.User;

public interface UserService {
	User getUserById(Integer id);

	List<User> getAllUsers();
}
