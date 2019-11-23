package com.todo.common.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "Task")
@Table(name = "task")
public class Task extends BaseEntity {
	private Integer userID;
	private Date date;
	private Date time;
	private String taskStatus;
	private String description;
	private String priority;
	private Integer categoryID;

	public Integer getUserID() {
		return userID;
	}

	public void setUserID(Integer userID) {
		this.userID = userID;
	}

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

	public String getTaskStatus() {
		return taskStatus;
	}

	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}
}
