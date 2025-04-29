package com.ifood.simulator.state;

import com.ifood.simulator.model.Order;

public class NewOrderState implements OrderState {
    @Override
    public void next(Order order) {
        order.setState(new PreparingState());
    }

    @Override
    public void printStatus() {
        System.out.println("Pedido recebido, aguardando preparo.");
    }
}