package com.foodordering.system.model.restaurant;

import lombok.Getter;

import java.util.List;

@Getter
public class FoodItem {
    private int price;
    private String name;
    private List<Ingredients> extraIngredients;
    private List<String> category;

    FoodItem(String name,int price){
        this.price=price;
        this.name=name;
    }

    public void addExtraIngredients(Ingredients ingredients){

        this.extraIngredients.add(ingredients);
    }
}
