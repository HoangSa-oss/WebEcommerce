package com.hoangsa.web.service;

import com.hoangsa.web.dto.Purchase;
import com.hoangsa.web.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
