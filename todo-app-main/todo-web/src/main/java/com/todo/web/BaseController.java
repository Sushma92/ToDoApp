package com.todo.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.todo.common.entity.BaseEntity;
import com.todo.services.BaseService;

public abstract class BaseController<T extends BaseEntity, R> {

	@GetMapping(path = "/create")
	public ResponseEntity<String> create(T entity) {
		this.getBaseService().create(entity);
		return ResponseEntity.ok("");
	}

	@GetMapping(path = "update")
	public ResponseEntity<String> update(T entity) {
		return ResponseEntity.ok("");
	}

	@GetMapping(path = "read")
	public ResponseEntity<String> read(Long id) {
		return ResponseEntity.ok("");
	}

	@GetMapping(path = "delete")
	public ResponseEntity<String> delete(Long id) {
		return ResponseEntity.ok("");
	}

	
	public abstract BaseService<T, R> getBaseService();
	
}
