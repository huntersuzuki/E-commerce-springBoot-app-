package com.pranay.dreamshops.services.order;

import com.pranay.dreamshops.model.Order;

public interface IOrderService {
    Order placeOrder(Long userId);

    Order getOrder(Long orderId);
}
