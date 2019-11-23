package com.todo.common.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "Category")
@Table(name = "category")
public class Category extends BaseEntity {
	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
