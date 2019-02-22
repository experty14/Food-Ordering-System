package com.foodordering.system.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import java.util.HashMap;

@EqualsAndHashCode
@Getter
@AllArgsConstructor
public class Ingredients {
    private HashMap<String,Integer> itemList;

    public void addIngredient(String item,Integer price){
        itemList.put(item,price);
    }
}
