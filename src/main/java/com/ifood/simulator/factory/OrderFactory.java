package com.ifood.simulator.factory;

import com.ifood.simulator.model.Order;

import java.util.List;

public class OrderFactory {
    private static OrderFactory instance;
    private int orderCounter = 1;

    private OrderFactory() {}

    public static synchronized OrderFactory getInstance() {
        if (instance == null) {
            instance = new OrderFactory();
        }
        return instance;
    }

    public Order createOrder(String customerName, String restaurantName, List<String> items) {
        String orderId = "ORD-" + orderCounter++;
        return new Order(orderId, customerName, restaurantName, items);
    }
}