package com.ifood.simulator.model;

import com.ifood.simulator.state.OrderState;
import com.ifood.simulator.state.NewOrderState;
import com.ifood.simulator.observer.OrderObserver;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String id;
    private String customerName;
    private String restaurantName;
    private List<String> items;
    private OrderState state;
    private List<OrderObserver> observers = new ArrayList<>();

    public Order(String id, String customerName, String restaurantName, List<String> items) {
        this.id = id;
        this.customerName = customerName;
        this.restaurantName = restaurantName;
        this.items = items;
        this.state = new NewOrderState();
    }

    public void addObserver(OrderObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(OrderObserver observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for (OrderObserver observer : observers) {
            observer.update(this);
        }
    }

    public void setState(OrderState state) {
        this.state = state;
        notifyObservers();
    }

    public void nextState() {
        state.next(this);
    }

    public void printStatus() {
        state.printStatus();
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public List<String> getItems() {
        return items;
    }

    public OrderState getState() {
        return state;
    }
}