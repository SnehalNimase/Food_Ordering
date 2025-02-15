package com.flavourHub.service;

import java.util.List;

import com.flavourHub.model.Notification;
import com.flavourHub.model.Order;
import com.flavourHub.model.Restaurant;
import com.flavourHub.model.User;

public interface NotificationService {
	
	public Notification sendOrderStatusNotification(Order order);
	public void sendRestaurantNotification(Restaurant restaurant, String message);
	public void sendPromotionalNotification(User user, String message);
	
	public List<Notification> findUsersNotification(Long userId);

}
