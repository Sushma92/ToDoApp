package com.todo.dao;

import org.springframework.stereotype.Repository;

import com.todo.common.entity.User;

@Repository
public interface UserDAO extends BaseDAO<User, User>{
	public User create(User user);
	public User update(User user);
	public User read();
	public void delete(User user);
}
