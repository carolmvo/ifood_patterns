package com.ifood.simulator;

import com.ifood.simulator.factory.OrderFactory;
import com.ifood.simulator.factory.RestaurantFactory;
import com.ifood.simulator.model.Order;
import com.ifood.simulator.model.Restaurant;
import com.ifood.simulator.observer.Customer;
import com.ifood.simulator.observer.RestaurantManager;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Factory
        RestaurantFactory restaurantFactory = new RestaurantFactory();
        Restaurant restaurant = restaurantFactory.createRestaurant("Pizza Palace", "Italiana");

        OrderFactory orderFactory = OrderFactory.getInstance(); // Singleton Pattern

        List<String> items = Arrays.asList("Pizza Margherita", "Coca-Cola", "Tiramisu");
        Order order = orderFactory.createOrder("João Silva", restaurant.getName(), items);

        // Observer
        Customer customer = new Customer("João Silva");
        RestaurantManager manager = new RestaurantManager(restaurant.getName());

        order.addObserver(customer);
        order.addObserver(manager);

        // State
        System.out.println("\n--- Simulação de Pedido ---");
        System.out.println("Pedido criado: " + order.getId());
        System.out.println("Itens: " + String.join(", ", order.getItems()));

        System.out.println("\nEstado inicial:");
        order.printStatus();

        System.out.println("\nAvançando para preparo:");
        order.nextState();
        order.printStatus();

        System.out.println("\nAvançando para entrega:");
        order.nextState();
        order.printStatus();

        System.out.println("\nAvançando para entregue:");
        order.nextState();
        order.printStatus();

        System.out.println("\nTentando avançar após entrega:");
        order.nextState();
    }
}