package com.todo.dao;

import org.springframework.stereotype.Repository;

import com.todo.common.entity.Project;

@Repository
public interface ProjectDAO extends BaseDAO<Project, Project> {
	public Project create(Project project);
	public Project update(Project project);
	public Project read();
	public void delete(Project project);
}
