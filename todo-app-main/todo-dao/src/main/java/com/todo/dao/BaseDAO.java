package com.todo.dao;

import com.todo.common.entity.BaseEntity;

public interface BaseDAO<E extends BaseEntity, R> {
public R create(E e);

public R update(E e);
public R read();
public void delete(Integer id);

}
