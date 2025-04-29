package com.ifood.simulator.model;

import com.ifood.simulator.state.NewOrderState;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class OrderTest {
    @Test
    void shouldInitializeWithCorrectValues() {
        Order order = new Order("123", "João", "Pizza Hut", List.of("Pizza", "Refri"));

        assertEquals("123", order.getId());
        assertEquals("João", order.getCustomerName());
        assertTrue(order.getState() instanceof NewOrderState);
    }

    @Test
    void shouldNotifyObserversOnStateChange() {
        Order order = new Order("1", "Maria", "Burger King", List.of("Whopper"));
        TestObserver observer = new TestObserver();
        order.addObserver(observer);

        order.nextState();

        assertTrue(observer.wasNotified);
    }

    private static class TestObserver implements OrderObserver {
        boolean wasNotified = false;

        @Override
        public void update(Order order) {
            wasNotified = true;
        }
    }
}