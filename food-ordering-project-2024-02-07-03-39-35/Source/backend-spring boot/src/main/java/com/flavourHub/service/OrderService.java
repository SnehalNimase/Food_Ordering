package com.flavourHub.service;

import java.util.List;

import com.stripe.exception.StripeException;
import com.flavourHub.Exception.CartException;
import com.flavourHub.Exception.OrderException;
import com.flavourHub.Exception.RestaurantException;
import com.flavourHub.Exception.UserException;
import com.flavourHub.model.Order;
import com.flavourHub.model.PaymentResponse;
import com.flavourHub.model.User;
import com.flavourHub.request.CreateOrderRequest;

public interface OrderService {
	
	 public PaymentResponse createOrder(CreateOrderRequest order, User user) throws UserException, RestaurantException, CartException, StripeException;
	 
	 public Order updateOrder(Long orderId, String orderStatus) throws OrderException;
	 
	 public void cancelOrder(Long orderId) throws OrderException;
	 
	 public List<Order> getUserOrders(Long userId) throws OrderException;
	 
	 public List<Order> getOrdersOfRestaurant(Long restaurantId,String orderStatus) throws OrderException, RestaurantException;
	 

}
