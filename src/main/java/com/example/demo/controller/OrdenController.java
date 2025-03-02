package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.services.OrderService;
import com.example.demo.models.Order;
import java.util.List;

@RestController
public class OrdenController {

    @Autowired
    private OrderService orderService;

    /**
     * GET /orders - Retrieve all orders.
     * @return List of orders
     */
    @GetMapping
    public List<Order> getOrders() {
        return orderService.getAllOrders();
    }

    /**
     * POST /orders - Add a new order.
     * @param order Order object
     * @return Saved order
     */
    @PostMapping
    public Order createOrder(@RequestBody Order order) {
        return orderService.addOrder(order);
    }

    /**
     * DELETE /orders/{id} - Delete an order by ID.
     * @param id Order ID
     */
    @DeleteMapping("/{id}")
    public void deleteOrder(@PathVariable Long id) {
        orderService.deleteOrder(id);
    }
}
