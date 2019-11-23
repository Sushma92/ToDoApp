package com.todo.common.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "Project")
@Table(name = "project")
public class Project extends BaseEntity{
	private Date date;
	private Date time;
	private String projectStatus;

	private String projectDescription;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getProjectStatus() {
		return projectStatus;
	}

	public void setProjectStatus(String projectStatus) {
		this.projectStatus = projectStatus;
	}

	public String getProjectDescription() {
		return projectDescription;
	}

	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}
}
