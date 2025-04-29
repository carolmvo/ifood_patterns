package com.ifood.simulator.model;

public class Restaurant {
    private String name;
    private String cuisineType;

    public Restaurant(String name, String cuisineType) {
        this.name = name;
        this.cuisineType = cuisineType;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getCuisineType() {
        return cuisineType;
    }
}