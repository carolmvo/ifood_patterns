package com.ifood.simulator.state;

import com.ifood.simulator.model.Order;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DeliveringStateTest {
    @Test
    void shouldTransitionToDelivered() {
        Order order = new Order("1", "Cliente", "Restaurante", List.of("Item"));
        DeliveringState state = new DeliveringState();

        state.next(order);

        assertTrue(order.getState() instanceof DeliveredState);
    }
}