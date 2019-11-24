package com.todo.common.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "Task")
@Table(name = "task")
public class Task extends BaseEntity {

	@Column(name = "user_id")
	private Long userId;

	@Column(name = "task_date")
	private Date taskDate;

	@Column(name = "task_hour")
	private Integer taskHour;

	@Column(name = "task_minute")
	private Integer taskMinute;

	@Column(name = "task_second")
	private Integer taskSecond;

	@Column(name = "description", length = 1000)
	private String description;

	@Column(name = "priority")
	private Integer priority;

	@Column(name = "category_id")
	private Long categoryId;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Date getTaskDate() {
		return taskDate;
	}

	public void setTaskDate(Date taskDate) {
		this.taskDate = taskDate;
	}

	public Integer getTaskHour() {
		return taskHour;
	}

	public void setTaskHour(Integer taskHour) {
		this.taskHour = taskHour;
	}

	public Integer getTaskMinute() {
		return taskMinute;
	}

	public void setTaskMinute(Integer taskMinute) {
		this.taskMinute = taskMinute;
	}

	public Integer getTaskSecond() {
		return taskSecond;
	}

	public void setTaskSecond(Integer taskSecond) {
		this.taskSecond = taskSecond;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

}
