package com.biblio.model;
import java.util.Date;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import javax.validation.constraints.Email;



@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
@Getter
@Setter
@Builder
@Entity
@Table(name="customer")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

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

    public User(int id, String email, String customer_lastname, String customer_firstname, String pass) {
        this.id = id;
        this.email = email;
        this.customer_lastname = customer_lastname;
        this.customer_firstname = customer_firstname;
        this.pass = pass;
    }

    public void setId(int id) {
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

    public int getId() {
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
}
