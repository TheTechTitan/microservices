package com.infinity.shoppingcloud.profileservice.repository;

import com.infinity.shoppingcloud.commons.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
