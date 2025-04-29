package com.ifood.simulator.state;

import com.ifood.simulator.model.Order;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PreparingStateTest {
    @Test
    void shouldTransitionToDelivering() {
        Order order = new Order("1", "Cliente", "Restaurante", List.of("Item"));
        PreparingState state = new PreparingState();

        state.next(order);

        assertTrue(order.getState() instanceof DeliveringState);
    }
}