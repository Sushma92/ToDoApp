package com.todo.services;

import org.springframework.stereotype.Service;

import com.todo.common.entity.ProjectTaskInfo;

@Service
public class ProjectTaskInfoService extends BaseService<ProjectTaskInfo, ProjectTaskInfo> {

	@Override
	public ProjectTaskInfo create(ProjectTaskInfo projectTaskInfo) {
		return null;
	}

	@Override
	public ProjectTaskInfo update(ProjectTaskInfo projectTaskInfo) {
		return null;
	}

	@Override
	public ProjectTaskInfo read(Long id) {
		return null;
	}

	@Override
	public void delete(Long id) {

	}

	@Override
	public void generateMultiple(Integer noOfEntities) {
		
	}

}
