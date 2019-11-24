package com.todo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todo.common.entity.Task;

@RestController
@RequestMapping(path = "/api/services/todo-app/task")
public class TaskController extends BaseController<Task, Task> {

}
