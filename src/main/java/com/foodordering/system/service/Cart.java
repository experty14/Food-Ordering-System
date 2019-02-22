package com.foodordering.system.service;

public interface Cart {
    void addToCart(CartRequest cartRequest);

    void removeFromCart(CartRequest cartRequest);

    int getTotalPrice();
}
