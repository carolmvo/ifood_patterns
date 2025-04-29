package com.ifood.simulator.factory;

import com.ifood.simulator.model.Order;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class OrderFactoryTest {
    @Test
    void shouldReturnSameInstance() {
        OrderFactory instance1 = OrderFactory.getInstance();
        OrderFactory instance2 = OrderFactory.getInstance();
        assertSame(instance1, instance2);
    }

    @Test
    void shouldGenerateSequentialOrderIds() {
        Order order1 = OrderFactory.getInstance().createOrder("Cliente", "Restaurante", List.of("Item"));
        Order order2 = OrderFactory.getInstance().createOrder("Cliente", "Restaurante", List.of("Item"));

        assertNotEquals(order1.getId(), order2.getId());
    }
}