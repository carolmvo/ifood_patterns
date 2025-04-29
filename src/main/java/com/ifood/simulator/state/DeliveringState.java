package com.ifood.simulator.state;

import com.ifood.simulator.model.Order;

public class DeliveringState implements OrderState {
    @Override
    public void next(Order order) {
        order.setState(new DeliveredState());
    }

    @Override
    public void printStatus() {
        System.out.println("Pedido saiu para entrega.");
    }
}