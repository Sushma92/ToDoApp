package com.todo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todo.common.entity.Project;

@RestController
@RequestMapping(path = "/api/services/todo-app/project")
public class ProjectController extends BaseController<Project, Project> {

}
