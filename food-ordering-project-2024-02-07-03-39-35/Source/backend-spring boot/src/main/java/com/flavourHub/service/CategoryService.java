package com.flavourHub.service;

import java.util.List;

import com.flavourHub.Exception.RestaurantException;
import com.flavourHub.model.Category;

public interface CategoryService {
	
	public Category createCategory (String name,Long userId) throws RestaurantException;
	public List<Category> findCategoryByRestaurantId(Long restaurantId) throws RestaurantException;
	public Category findCategoryById(Long id) throws RestaurantException;

}
