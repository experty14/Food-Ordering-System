package com.foodordering.system.model;

import lombok.Getter;
import java.math.BigInteger;
import java.util.List;

@Getter
public class ContactDetails {
    private List<BigInteger> contactNumberList;
    private Address address;

    ContactDetails(List<BigInteger> contactNumberList,Address address){
        this.contactNumberList=contactNumberList;
        this.address=address;
    }
}
