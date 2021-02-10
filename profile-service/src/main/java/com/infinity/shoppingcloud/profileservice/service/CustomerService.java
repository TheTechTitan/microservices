package com.infinity.shoppingcloud.profileservice.service;

import com.infinity.shoppingcloud.commons.model.Customer;

import java.util.List;

public interface CustomerService {

    Customer save(Customer customer);
    Customer fetchById(int profileId);
    List<Customer> fetchAllProfiles();
}
