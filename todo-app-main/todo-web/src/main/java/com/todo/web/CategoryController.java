package com.todo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todo.common.entity.Category;

@RestController
@RequestMapping(path = "/api/services/todo-app/category")
public class CategoryController extends BaseController<Category, Category> {

}
