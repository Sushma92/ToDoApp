package com.todo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todo.common.entity.Category;
import com.todo.services.BaseService;
import com.todo.services.CategoryService;

@RestController
@RequestMapping(path = "/api/services/todo-app/category", produces = "application/json")
public class CategoryController extends BaseController<Category, Category> {

	@Autowired
	CategoryService categoryService;


	@Override
	public BaseService<Category, Category> getBaseService() {
		return categoryService;
	} 
	
	
}
