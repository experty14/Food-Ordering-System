package com.foodordering.system.service;

import com.foodordering.system.model.restaurant.FoodItem;
import com.foodordering.system.model.restaurant.Restaurant;
import lombok.Getter;
import java.util.List;
@Getter
public class CartRequest {
    private List<FoodItem> itemList;
    private Restaurant restaurant;

    CartRequest(List<FoodItem> itemList,Restaurant restaurant){
        this.itemList=itemList;
        this.restaurant=restaurant;
    }


}
