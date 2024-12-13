package com.khadok.service;

import com.khadok.model.Category;
import com.khadok.model.Food;
import com.khadok.model.Restaurant;
import com.khadok.request.CreateFoodRequest;

import java.util.List;

public interface FoodService {
    public Food createFood(CreateFoodRequest req, Category category, Restaurant restaurant);
    void deleteFood(Long foodId) throws Exception;
    public List<Food> getRestaurantsFood(Long restaurantId, boolean isVegetarin, boolean isNonveg,boolean isSeasonal, String foodCategory);
    public List<Food> searchFood(String keyword);
    public Food findFoodById(Long foodId)throws Exception;
    public Food updateAvailibiityStatus(Long foodId) throws Exception;


}
