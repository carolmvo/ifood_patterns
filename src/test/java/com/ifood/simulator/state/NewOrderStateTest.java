package com.ifood.simulator.state;

import com.ifood.simulator.model.Order;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NewOrderStateTest {
    @Test
    void shouldTransitionToPreparing() {
        Order order = new Order("1", "Cliente", "Restaurante", List.of("Item"));
        NewOrderState state = new NewOrderState();

        state.next(order);

        assertTrue(order.getState() instanceof PreparingState);
    }
}