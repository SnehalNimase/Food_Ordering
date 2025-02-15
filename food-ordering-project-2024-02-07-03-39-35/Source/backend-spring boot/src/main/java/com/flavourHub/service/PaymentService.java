package com.flavourHub.service;

import com.stripe.exception.StripeException;
import com.flavourHub.model.Order;
import com.flavourHub.model.PaymentResponse;

public interface PaymentService {
	
	public PaymentResponse generatePaymentLink(Order order) throws StripeException;

}
