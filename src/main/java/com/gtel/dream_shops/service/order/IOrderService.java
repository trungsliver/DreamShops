package com.gtel.dream_shops.service.order;

import com.gtel.dream_shops.model.Order;

public interface IOrderService {
    Order placeOrder(Long userId);
    Order getOrder(Long orderId);
}
