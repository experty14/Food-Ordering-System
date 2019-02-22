package com.foodordering.system.service;

import com.foodordering.system.model.FoodItem;
import com.foodordering.system.model.Restaurant;

import java.util.*;

public class RestaurantSearchService implements SearchService {
    List<Restaurant> restaurantList;

    RestaurantSearchService(List<Restaurant> restaurantList){
        this.restaurantList=restaurantList;
    }

    @Override
    public List<FoodItem> searchByItemName(String foodItem){
        List<FoodItem> foodItemList=new ArrayList<>();
        for (Restaurant restaurant:restaurantList) {
            foodItemList.add(restaurant.searchByName(foodItem));
        }
        return foodItemList;
    }

    @Override
    public List<FoodItem> searchByCategory(String category){
        List<FoodItem> foodItemList=new ArrayList<>();
        for (Restaurant restaurant:restaurantList) {
            foodItemList.addAll(restaurant.searchByCategory(category));
        }
        return foodItemList;
    }

    public void addRestaurant(Restaurant restaurant){
        restaurantList.add(restaurant);
    }

    public void removeRestaurant(Restaurant restaurant){
        restaurantList.remove(restaurant);
    }

}
