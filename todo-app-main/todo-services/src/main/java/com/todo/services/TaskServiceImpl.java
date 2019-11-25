package com.todo.services;

import org.springframework.stereotype.Service;

import com.todo.common.entity.Task;

@Service
public class TaskServiceImpl extends BaseService<Task, Task> {

	@Override
	public Task create(Task task) {
		return null;
	}

	@Override
	public Task update(Task task) {
		return null;
	}

	@Override
	public Task read(Long id) {
		return null;
	}

	@Override
	public void delete(Long id) {
		
	}
	
}
