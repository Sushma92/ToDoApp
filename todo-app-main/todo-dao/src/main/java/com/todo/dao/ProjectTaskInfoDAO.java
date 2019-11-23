package com.todo.dao;

import com.todo.common.entity.ProjectTaskInfo;

public interface ProjectTaskInfoDAO extends BaseDAO<ProjectTaskInfo, ProjectTaskInfo> {
	public ProjectTaskInfo create(ProjectTaskInfo projectTaskInfo);

	public ProjectTaskInfo update(ProjectTaskInfo projectTaskInfo);

	public ProjectTaskInfo read();

	public void delete(Integer id);
}
