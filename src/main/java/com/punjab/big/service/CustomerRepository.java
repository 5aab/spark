package com.punjab.big.service;



import com.punjab.big.domain.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface CustomerRepository  extends CrudRepository<Customer, Long> {

    public Customer findByFirstName(String firstName);
    public List<Customer> findByLastName(String lastName);

}