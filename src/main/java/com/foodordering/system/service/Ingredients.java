package com.foodordering.system.service;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.ArrayList;

@EqualsAndHashCode
@Getter
public class Ingredients {
    private ArrayList<String> itemList;

    public void addIngredient(String item){
        itemList.add(item);
    }


}
