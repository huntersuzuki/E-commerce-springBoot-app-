package com.pranay.dreamshops.services.cart;

import com.pranay.dreamshops.model.Cart;

import java.math.BigDecimal;

public interface ICartService {
	Cart getCart(Long id);

	void clearCart(Long id);

	BigDecimal getTotalPrice(Long id);
}
