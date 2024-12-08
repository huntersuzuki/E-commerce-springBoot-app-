package com.pranay.dreamshops.services.order;

import com.pranay.dreamshops.model.Order;

import java.util.List;

public interface IOrderService {
    Order placeOrder(Long userId);

    Order getOrder(Long orderId);

    List<Order> getUserOrders(Long userId);
}
