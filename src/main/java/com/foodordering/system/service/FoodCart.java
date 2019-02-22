package com.foodordering.system.service;

import com.foodordering.system.model.FoodItem;
import com.foodordering.system.model.Restaurant;
import lombok.Getter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
public class FoodCart implements Cart {
    private int appDiscount;
    private Map<Restaurant,List<FoodItem>> cart=new HashMap<>();
    private int totalPrice;

    @Override
    public void addToCart(CartRequest cartRequest){
        cart.put(cartRequest.getRestaurant(),cartRequest.getItemList());
    }

    @Override
    public void removeFromCart(CartRequest cartRequest){
        cart.remove(cartRequest.getRestaurant());
    }

    @Override
    public int getTotalPrice(){
     return 0;
    }

}
