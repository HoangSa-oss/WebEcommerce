package com.hoangsa.web.dto;


import java.util.Set;

import com.hoangsa.web.entity.Address;
import com.hoangsa.web.entity.Customer;
import com.hoangsa.web.entity.Order;
import com.hoangsa.web.entity.OrderItem;

import lombok.Data;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
