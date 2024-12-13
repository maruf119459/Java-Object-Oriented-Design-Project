package com.khadok.service;

import com.khadok.model.Order;
import com.khadok.response.PaymentResponse;
import com.stripe.exception.StripeException;

public interface PaymentService {
    public PaymentResponse createPaymentLink(Order order) throws StripeException;
}
