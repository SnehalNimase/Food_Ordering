package com.flavourHub.service;

import java.util.List;

import com.flavourHub.Exception.FoodException;
import com.flavourHub.Exception.RestaurantException;
import com.flavourHub.model.Category;
import com.flavourHub.model.Food;
import com.flavourHub.model.Restaurant;
import com.flavourHub.request.CreateFoodRequest;

public interface FoodService {

	public Food createFood(CreateFoodRequest req,Category category,
						   Restaurant restaurant) throws FoodException, RestaurantException;

	void deleteFood(Long foodId) throws FoodException;
	
	public List<Food> getRestaurantsFood(Long restaurantId,
			boolean isVegetarian, boolean isNonveg, boolean isSeasonal,String foodCategory) throws FoodException;
	
	public List<Food> searchFood(String keyword);
	
	public Food findFoodById(Long foodId) throws FoodException;

	public Food updateAvailibilityStatus(Long foodId) throws FoodException;
}
