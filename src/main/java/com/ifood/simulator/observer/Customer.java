package com.ifood.simulator.observer;

import com.ifood.simulator.model.Order;

public class Customer implements OrderObserver {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void update(Order order) {
        System.out.println("Notificação para o cliente " + name + ": Status do pedido " +
                order.getId() + " atualizado para " + order.getState().getClass().getSimpleName());
    }
}