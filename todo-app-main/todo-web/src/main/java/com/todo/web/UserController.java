package com.todo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todo.common.entity.User;

@RestController
@RequestMapping(path = "/api/services/todo-app/user")
public class UserController extends BaseController<User, User>{

}
