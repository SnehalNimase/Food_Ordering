package com.flavourHub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flavourHub.model.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {


//    CartItem findByFoodIsContaining

}
