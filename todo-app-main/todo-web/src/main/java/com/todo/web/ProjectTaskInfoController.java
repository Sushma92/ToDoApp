package com.todo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todo.common.entity.ProjectTaskInfo;

@RestController
@RequestMapping(path = "/api/services/todo-app/project-task-info")
public class ProjectTaskInfoController extends BaseController<ProjectTaskInfo, ProjectTaskInfo> {

}
