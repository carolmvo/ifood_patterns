package com.ifood.simulator.factory;

import com.ifood.simulator.model.Restaurant;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RestaurantFactoryTest {
    @Test
    void shouldCreateDifferentRestaurants() {
        Restaurant r1 = new RestaurantFactory().createRestaurant("R1", "Cozinha1");
        Restaurant r2 = new RestaurantFactory().createRestaurant("R2", "Cozinha2");

        assertNotEquals(r1.getName(), r2.getName());
    }
}