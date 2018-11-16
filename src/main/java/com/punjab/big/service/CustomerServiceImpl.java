package com.punjab.big.service;

import com.punjab.big.domain.Customer;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository repository;

    @Override
    public void insertSomeCustomers() {

        repository.deleteAll();

        repository.save(new Customer("Alice", "Smith"));
        repository.save(new Customer("Bob", "Smith"));

        log.info("Customers found with findAll():");
        log.info("-------------------------------");
        for (Customer customer : repository.findAll()) {
            log.info("{}",customer);
        }
        log.info("\n");

        log.info("Customer found with findByFirstName('Alice'):");
        log.info("--------------------------------");
        log.info("{}",repository.findByFirstName("Alice"));

        log.info("Customers found with findByLastName('Smith'):");
        log.info("--------------------------------");
        for (Customer customer : repository.findByLastName("Smith")) {
            log.info("{}",customer);
        }
    }

    @Override
    public String findSomeCustomers(){
        return repository.findAll().toString();
    }
}
