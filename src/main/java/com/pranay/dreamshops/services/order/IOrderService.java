package com.pranay.dreamshops.services.order;

import com.pranay.dreamshops.dto.OrderDto;
import com.pranay.dreamshops.model.Order;

import java.util.List;

public interface IOrderService {
    Order placeOrder(Long userId);

    OrderDto getOrder(Long orderId);

    List<OrderDto> getUserOrders(Long userId);

    OrderDto convertToDto(Order order);
}
