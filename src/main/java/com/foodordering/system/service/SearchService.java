package com.foodordering.system.service;

import com.foodordering.system.model.restaurant.FoodItem;

import java.util.List;

public interface SearchService {
    List<FoodItem> searchByItemName(String foodItem);

    List<FoodItem> searchByCategory(String category);
}
