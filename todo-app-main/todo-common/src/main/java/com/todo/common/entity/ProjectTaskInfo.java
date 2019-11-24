package com.todo.common.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "ProjectTaskInfo")
@Table(name = "project_task_info")
public class ProjectTaskInfo extends BaseEntity {

	@Column(name = "project_id")
	private Long projectId;

	@Column(name = "user_id")
	private Long userId;

	public Long getProjectId() {
		return projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

}
