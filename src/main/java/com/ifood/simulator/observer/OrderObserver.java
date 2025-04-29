package com.ifood.simulator.observer;

import com.ifood.simulator.model.Order;

public interface OrderObserver {
    void update(Order order);
}