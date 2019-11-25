package com.todo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todo.common.entity.Project;
import com.todo.services.BaseService;
import com.todo.services.ProjectService;

@RestController
@RequestMapping(path = "/api/services/todo-app/project")
public class ProjectController extends BaseController<Project, Project> {

	@Autowired
	ProjectService projectService;
	
	@Override
	public BaseService<Project, Project> getBaseService() {
		return projectService;
	}

}
