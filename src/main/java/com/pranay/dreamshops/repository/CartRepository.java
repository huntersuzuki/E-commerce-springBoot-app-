package com.pranay.dreamshops.repository;

import com.pranay.dreamshops.model.Cart;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("cart")
public interface CartRepository extends JpaRepository<Cart, Long> {
}
