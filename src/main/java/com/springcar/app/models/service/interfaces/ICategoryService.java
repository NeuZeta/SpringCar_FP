package com.springcar.app.models.service.interfaces;

import java.util.List;

import com.springcar.app.models.entity.Category;

public interface ICategoryService {

	public List<Category> findAll();
	public Category findCategoryByCode(String category);
	
}
