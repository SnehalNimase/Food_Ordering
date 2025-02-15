package com.flavourHub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flavourHub.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
