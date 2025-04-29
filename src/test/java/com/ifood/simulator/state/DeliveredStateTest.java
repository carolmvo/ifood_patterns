package com.ifood.simulator.state;

import com.ifood.simulator.model.Order;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DeliveredStateTest {
    @Test
    void shouldNotChangeState() {
        Order order = new Order("1", "Cliente", "Restaurante", List.of("Item"));
        DeliveredState state = new DeliveredState();

        state.next(order);

        assertTrue(order.getState() instanceof DeliveredState);
    }
}