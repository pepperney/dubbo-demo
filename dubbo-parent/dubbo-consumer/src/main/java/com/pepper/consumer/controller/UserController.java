package com.pepper.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pepper.api.common.ResponseData;
import com.pepper.api.enums.RESPONSE;
import com.pepper.api.model.user.User;
import com.pepper.api.service.user.UserService;

@RestController
@RequestMapping("user")
public class UserController {

	@Autowired
	UserService userService;
	
	
	
	@RequestMapping("getUsers") 
	public @ResponseBody ResponseData<User> getUsers() {
		ResponseData<User> res = new ResponseData<>();
		res.setCode(RESPONSE.SUCCESS);
		res.setMsg("success");
		res.setList(userService.getAllUsers());
		return res;
	}
	


}
