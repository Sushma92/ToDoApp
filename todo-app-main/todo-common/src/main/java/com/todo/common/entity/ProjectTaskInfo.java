package com.todo.common.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "ProjectTaskInfo")
@Table(name = "project_task_info")
public class ProjectTaskInfo extends BaseEntity{
	private Integer projectID;
	private Integer userID;

	public Integer getProjectID() {
		return projectID;
	}

	public void setProjectID(Integer projectID) {
		this.projectID = projectID;
	}

	public Integer getUserID() {
		return userID;
	}

	public void setUserID(Integer userID) {
		this.userID = userID;
	}
}
