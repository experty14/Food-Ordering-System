package com.foodordering.system.model;

import lombok.Getter;

import java.util.List;

@Getter
public class FoodItem {
    private int price;
    private String name;
    private List<Ingredients> extraIngredients;
    private List<String> category;

    FoodItem(int price,String name,List<String> category){
        this.price=price;
        this.name=name;
        this.category=category;
    }

    public void addExtraIngredients(Ingredients ingredients){

        this.extraIngredients.add(ingredients);
    }
}
