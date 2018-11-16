package com.punjab.big.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@AllArgsConstructor
public class CustomerController {

    private CustomerService customerService;

    @RequestMapping("/insert/some/customers")
    @ResponseBody
    void insertSomeCustomers(){
        customerService.insertSomeCustomers();
    }

    @RequestMapping("/find/some/customers")
    @ResponseBody
    String findSomeCustomers(){
       return customerService.findSomeCustomers();
    }
}
