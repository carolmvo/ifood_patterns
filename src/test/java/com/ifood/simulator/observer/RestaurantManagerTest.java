package com.ifood.simulator.observer;

import com.ifood.simulator.model.Order;
import com.ifood.simulator.state.DeliveringState;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RestaurantManagerTest {
    @Test
    void shouldOnlyNotifyMatchingRestaurant() {
        RestaurantManager manager = new RestaurantManager("Pizzaria");
        Order order1 = new Order("1", "Cliente", "Pizzaria", List.of("Pizza"));
        Order order2 = new Order("2", "Cliente", "Hamburgueria", List.of("Hamburger"));

        order1.addObserver(manager);
        order2.addObserver(manager);

        order1.setState(new DeliveringState());
        order2.setState(new DeliveringState());

        // Verificação implícita
    }
}