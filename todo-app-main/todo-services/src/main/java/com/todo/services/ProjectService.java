package com.todo.services;

import org.springframework.stereotype.Service;

import com.todo.common.entity.Project;

@Service
public class ProjectService extends BaseService<Project, Project> {

	@Override
	public Project create(Project project) {
		return null;
	}

	@Override
	public Project update(Project project) {
		return null;
	}

	@Override
	public Project read(Long id) {
		return null;
	}

	@Override
	public void delete(Long id) {

	}

}
