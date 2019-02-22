package com.foodordering.system.model.restaurant;

import com.foodordering.system.model.ContactDetails;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import java.util.ArrayList;
import java.util.List;

@Getter
@EqualsAndHashCode
public class Restaurant implements Discount{
    private List<FoodItem> foodMenu;
    private ContactDetails contactDetails;
    private int rating;
    private List<RestaurantCategory> categoryList;

    public FoodItem searchByName(String item){
        for (FoodItem foodItem:foodMenu) {
            if(foodItem.getName().equals(item)){
                return foodItem;
            }
        }
        return null;
    }

    public List<FoodItem> searchByCategory(String category) {
        List<FoodItem> resultItemList = new ArrayList<>();
        for (FoodItem foodItem : foodMenu) {
            if (foodItem.getCategory().contains(category)) {
                resultItemList.add(foodItem);
            }
        }
        return resultItemList;
    }

    @Override
    public Double itemDiscount() {

        return null;
    }

    @Override
    public Double SpecialEventDiscount() {
        return null;
    }

    @Override
    public Double specialCustomerDiscount() {
        return null;
    }
}