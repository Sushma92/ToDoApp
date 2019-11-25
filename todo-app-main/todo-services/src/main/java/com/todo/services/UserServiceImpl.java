package com.todo.services;

import org.springframework.stereotype.Service;

import com.todo.common.entity.User;

@Service
public class UserServiceImpl extends BaseService<User, User> {

	@Override
	public User create(User user) {
		return null;
	}

	@Override
	public User update(User user) {
		return null;
	}

	@Override
	public User read(Long id) {
		return null;
	}

	@Override
	public void delete(Long userID) {

	}

}
