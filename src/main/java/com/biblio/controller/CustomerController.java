package com.biblio.controller;

import com.biblio.model.Customer;

import com.biblio.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="biblio/customer")
public class CustomerController {
    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }


    @GetMapping
    public List<Customer> getCustomer(){
        return customerService.getCustomer();
    }


    @PostMapping
    public void registerNewCustomer(@RequestBody Customer customer){
        customerService.addNewCustomer(customer);
    }
    @DeleteMapping(path="{id}")
    public void deleteCustomer(@PathVariable("id") Long id){
        customerService.deleteCustomer(id);
    }

    @PutMapping(path = "id")
    public void updateCustomer(
            @PathVariable("id") Long id,
            @RequestParam(required = false) String customer_lastname,
            @RequestParam(required = false) String customer_firstname,
            @RequestParam(required = false) String email,
            @RequestParam(required = false) String pass
    ){
        customerService.updateCustomer(id, customer_lastname,customer_firstname, email, pass);
    }
}
