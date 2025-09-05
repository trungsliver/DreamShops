package com.gtel.dream_shops.service.order;

import com.gtel.dream_shops.dto.OrderDto;
import com.gtel.dream_shops.model.Order;

import java.util.List;

public interface IOrderService {
    Order placeOrder(Long userId);
    Order getOrder(Long orderId);
    List<OrderDto> getUserOrders(Long userId);
}
