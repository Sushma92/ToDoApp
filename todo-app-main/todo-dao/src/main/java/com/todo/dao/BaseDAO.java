package com.todo.dao;

import org.springframework.data.repository.CrudRepository;

import com.todo.common.entity.BaseEntity;

public interface BaseDAO<E extends BaseEntity, R> extends CrudRepository<E, Long> {

}
