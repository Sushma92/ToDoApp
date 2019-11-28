package com.todo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todo.common.entity.User;
import com.todo.services.BaseService;
import com.todo.services.UserServiceImpl;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "/api/services/todo-app/user")

public class UserController extends BaseController<User, User>{

	@Autowired
	UserServiceImpl userServiceImpl;
	
	@Override
	public BaseService<User, User> getBaseService() {
		return userServiceImpl;
	}

}
