package com.ifood.simulator.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RestaurantTest {
    @Test
    void shouldCreateRestaurantWithValidData() {
        Restaurant restaurant = new Restaurant("Sushi Bar", "Japonesa");

        assertEquals("Sushi Bar", restaurant.getName());
        assertEquals("Japonesa", restaurant.getCuisineType());
    }
}