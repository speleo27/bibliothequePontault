package com.biblio.repository;

import com.biblio.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    @Query("select s from Customer s WHERE s.email=?1")
    Optional<Customer> findCustomerByEmail(String email);
}