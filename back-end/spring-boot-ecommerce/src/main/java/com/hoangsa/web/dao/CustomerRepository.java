package com.hoangsa.web.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hoangsa.web.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Customer findByEmail(String theEmail);

}
