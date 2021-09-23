package com.biblio.model;
import java.util.Date;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import javax.validation.constraints.Email;




@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
@Getter
@Setter
@Builder
@Entity
@Table(name="customer")
public class Customer {
    @Id
    @SequenceGenerator(
            name = "user_seq",
            sequenceName = "user_seq",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "user_seq")
    private Long id;

    @Email
    @Column(name = "email", unique = true)
    private String email;

    @Basic(optional = false)
    @Column(name="user_lastname")
    private String customer_lastname;

    @Basic(optional = false)
    @Column(name="user_firstname")
    private String customer_firstname;

    @Basic(optional = false)
    @Column(name="pass")
    private String pass;

    public Customer() {
    }

    public Customer(String email, String customer_lastname, String customer_firstname, String pass) {
        this.email = email;
        this.customer_lastname = customer_lastname;
        this.customer_firstname = customer_firstname;
        this.pass = pass;
    }

    public Customer(Long id, String email, String customer_lastname, String customer_firstname, String pass) {
        this.id = id;
        this.email = email;
        this.customer_lastname = customer_lastname;
        this.customer_firstname = customer_firstname;
        this.pass = pass;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCustomer_lastname(String customer_lastname) {
        this.customer_lastname = customer_lastname;
    }

    public void setCustomer_firstname(String customer_firstname) {
        this.customer_firstname = customer_firstname;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getCustomer_lastname() {
        return customer_lastname;
    }

    public String getCustomer_firstname() {
        return customer_firstname;
    }

    public String getPass() {
        return pass;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", customer_lastname='" + customer_lastname + '\'' +
                ", customer_firstname='" + customer_firstname + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }
}
