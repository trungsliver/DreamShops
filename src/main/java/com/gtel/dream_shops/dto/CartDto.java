package com.gtel.dream_shops.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CartDto {
    private Long cartId;
    private Set<CartItemDto> items;
    private BigDecimal totalAmount;
}
