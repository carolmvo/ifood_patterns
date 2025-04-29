package com.ifood.simulator.state;

import com.ifood.simulator.model.Order;

public class DeliveredState implements OrderState {
    @Override
    public void next(Order order) {
        System.out.println("Pedido já foi entregue. Nenhuma ação adicional.");
    }

    @Override
    public void printStatus() {
        System.out.println("Pedido entregue ao cliente.");
    }
}