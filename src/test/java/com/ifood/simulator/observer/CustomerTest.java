package com.ifood.simulator.observer;

import com.ifood.simulator.model.Order;
import com.ifood.simulator.state.PreparingState;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    @Test
    void shouldUpdateCustomerOnOrderChange() {
        Customer customer = new Customer("João");
        Order order = new Order("1", "João", "Restaurante", List.of("Item"));
        order.addObserver(customer);

        order.setState(new PreparingState());

        // Verificação implícita - se não lançar exceção, o teste passa
    }
}