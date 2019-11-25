package com.todo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.common.entity.Category;
import com.todo.dao.CategoryDAO;

@Service
public class CategoryService extends BaseService<Category, Category> {

	@Autowired
	CategoryDAO categoryDao;

	@Override
	public Category create(Category category) {
		category = categoryDao.save(category);
		return category;
	}

	@Override
	public Category update(Category category) {
		category = categoryDao.save(category);
		return category;
	}

	@Override
	public Category read(Long id) {
		Category category = categoryDao.findById(id).orElse(null);
		return category;
	}

	@Override
	public void delete(Long id) {
		categoryDao.deleteById(id);
	}

	@Override
	public void generateMultiple(Integer noOfEntities) {
		
	}

}
