package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.models.Order;
import com.example.demo.repository.OrderRepository;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    /**
     * Retrieve all orders from the database.
     * @return List of orders
     */
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    /**
     * Save a new order to the database.
     * @param order Order object
     * @return Saved order
     */
    public Order addOrder(Order order) {
        return orderRepository.save(order);
    }

    /**
     * Delete an order by ID.
     * @param id Order ID
     */
    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }
}
