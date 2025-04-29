package com.ifood.simulator.state;

import com.ifood.simulator.model.Order;

public class PreparingState implements OrderState {
    @Override
    public void next(Order order) {
        order.setState(new DeliveringState());
    }

    @Override
    public void printStatus() {
        System.out.println("Pedido em preparo no restaurante.");
    }
}