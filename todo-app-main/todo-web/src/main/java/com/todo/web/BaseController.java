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
		this.getBaseService().update(entity);
		return ResponseEntity.ok("");
	}

	@GetMapping(path = "read")
	public ResponseEntity<T> read(Long id) {
		T entity = this.getBaseService().read(id);
		return ResponseEntity.ok(entity);
	}

	@GetMapping(path = "delete")
	public ResponseEntity<String> delete(Long id) {
		this.getBaseService().delete(id);
		return ResponseEntity.ok("");
	}

	
	public abstract BaseService<T, R> getBaseService();
	
	@GetMapping(path = "/generate-multiple")
	public ResponseEntity<String> generateMultiple(Integer noOfEntities){
		this.getBaseService().generateMultiple(noOfEntities);
		return ResponseEntity.ok("");
	}
	
}
