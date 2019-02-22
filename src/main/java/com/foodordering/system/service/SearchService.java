package com.foodordering.system.service;

import com.foodordering.system.model.FoodItem;

import java.util.List;

public interface SearchService {
    List<FoodItem> searchByItemName(String foodItem);

    List<FoodItem> searchByCategory(String category);
}
