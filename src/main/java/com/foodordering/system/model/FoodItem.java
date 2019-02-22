package com.foodordering.system.model;

import com.foodordering.system.service.Ingredients;
import lombok.Getter;

import java.util.List;

@Getter
public class FoodItem {
    private int price;
    private String name;
    private Ingredients extraIngredients;
    private List<String> category;

    FoodItem(int price,String name,List<String> category){
        this.price=price;
        this.name=name;
        this.category=category;
    }

    public void addExtraIngredients(Ingredients extraIngredients){
        this.extraIngredients=extraIngredients;
    }
}
