package com.todo.dao;

import org.springframework.stereotype.Repository;

import com.todo.common.entity.Category;


@Repository
public interface CategoryDAO extends BaseDAO<Category, Category>{
public Category create(Category category);
public Category update(Category category);
public Category read();
public void delete(Category category);
}
