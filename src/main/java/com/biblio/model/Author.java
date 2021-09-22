package com.biblio.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;


@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
@Getter
@Setter
@Builder
@Entity
@Table(name = "author")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Basic(optional = false)
    @Column(name="lastname")
    private String author_lastname;

    @Basic
    @Column(name = "firstname")
    private String author_firstname;

    public Author(int id, String author_lastname) {
        this.id = id;
        this.author_lastname = author_lastname;
    }

    public Author(int id, String author_lastname, String author_firstname) {
        this.id = id;
        this.author_lastname = author_lastname;
        this.author_firstname = author_firstname;
    }

    public Author(String author_lastname, String author_firstname) {
        this.author_lastname = author_lastname;
        this.author_firstname = author_firstname;
    }

    public String getAuthor_lastname() {
        return author_lastname;
    }

    public void setAuthor_lastname(String author_lastname) {
        this.author_lastname = author_lastname;
    }

    public String getAuthor_firstname() {
        return author_firstname;
    }



    public void setAuthor_firstname(String author_firstname) {
        this.author_firstname = author_firstname;
    }
}
