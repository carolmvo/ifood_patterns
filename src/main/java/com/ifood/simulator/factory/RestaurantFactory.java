package com.ifood.simulator.factory;

import com.ifood.simulator.model.Restaurant;

public class RestaurantFactory {
    public Restaurant createRestaurant(String name, String cuisineType) {
        return new Restaurant(name, cuisineType);
    }
}