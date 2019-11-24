package com.todo.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;

import com.todo.common.entity.BaseEntity;

public class BaseController<T extends BaseEntity, R> {

	@RequestMapping(path = "create")
	public ResponseEntity<String> create(T entity) {
		return ResponseEntity.ok("");
	}

	@RequestMapping(path = "update")
	public ResponseEntity<String> update(T entity) {
		return ResponseEntity.ok("");
	}

	@RequestMapping(path = "read")
	public ResponseEntity<String> read(Long id) {
		return ResponseEntity.ok("");
	}

	@RequestMapping(path = "delete")
	public ResponseEntity<String> delete(Long id) {
		return ResponseEntity.ok("");
	}

	
}
