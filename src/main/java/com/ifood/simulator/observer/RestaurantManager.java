package com.ifood.simulator.observer;

import com.ifood.simulator.model.Order;

public class RestaurantManager implements OrderObserver {
    private String restaurantName;

    public RestaurantManager(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    @Override
    public void update(Order order) {
        if (order.getRestaurantName().equals(restaurantName)) {
            System.out.println("Notificação para o gerente do restaurante " + restaurantName +
                    ": Status do pedido " + order.getId() + " atualizado para " +
                    order.getState().getClass().getSimpleName());
        }
    }
}