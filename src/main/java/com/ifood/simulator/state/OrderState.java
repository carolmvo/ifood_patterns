package com.ifood.simulator.state;

import com.ifood.simulator.model.Order;

public interface OrderState {
    void next(Order order);
    void printStatus();
}