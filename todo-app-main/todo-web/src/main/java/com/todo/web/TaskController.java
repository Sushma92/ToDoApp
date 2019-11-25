package com.todo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todo.common.entity.Task;
import com.todo.services.BaseService;
import com.todo.services.TaskServiceImpl;

@RestController
@RequestMapping(path = "/api/services/todo-app/task")
public class TaskController extends BaseController<Task, Task> {

	@Autowired
	TaskServiceImpl taskServiceImpl;
	
	@Override
	public BaseService<Task, Task> getBaseService() {
		return taskServiceImpl;
	}

}
