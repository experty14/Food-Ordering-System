package com.foodordering.system.model.user;

import com.foodordering.system.model.Address;
import com.foodordering.system.model.ContactDetails;
import lombok.Data;

@Data
public class User {

    public User(String name,UserType userType) {
        this.name = name;
        this.userType=userType;
    }
    private UserType userType;
    private String name;
    private Address address;
    private ContactDetails contactDetails;

}
