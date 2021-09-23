package com.biblio.service;

import com.biblio.model.Customer;
import com.biblio.repository.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class CustomerService {
    public final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getCustomer(){
        return customerRepository.findAll();}

    public void addNewCustomer(Customer customer) {
        Optional<Customer> customerOptional = customerRepository.findCustomerByEmail(customer.getEmail());
        if(customerOptional.isPresent()){
            throw  new IllegalStateException("email invalide");

        }
        customerRepository.save(customer);
        System.out.println("customer = " + customer);
    }

    public void deleteCustomer(Long id) {
      boolean exists =  customerRepository.existsById(id);
      if(!exists){
          throw new IllegalStateException("customer with id" + id + "does not exist");
      }
      customerRepository.deleteById(id);
    }
    @Transactional
    public void updateCustomer(Long id, String customer_lastname, String customer_firstname, String email, String pass){
        Customer customer = customerRepository.findById(id).orElseThrow(()-> new IllegalStateException("customer with id "+ id + " does not exist"));
        if(customer_lastname!= null && customer_lastname.length()>0 && !Objects.equals(customer.getCustomer_lastname(), customer_lastname)){
            customer.setCustomer_lastname(customer_lastname);
        }
        if(customer_firstname!= null && customer_firstname.length()>0 && !Objects.equals(customer.getCustomer_firstname(), customer_lastname)){
            customer.setCustomer_firstname(customer_firstname);
        }
        if(email!= null && email.length()>0 && !Objects.equals(customer.getEmail(), email)){
            Optional<Customer> customerOptional =customerRepository.findCustomerByEmail(email);
            if(customerOptional.isPresent()){
                throw new IllegalStateException("email taken");
            }
            customer.setEmail(email);
        }
        if(pass!= null && pass.length()>0 && !Objects.equals(customer.getPass(), pass)){
            customer.setPass(pass);
        }


    }
}
