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
@Table(name="copy")

public class Copy {
    @Id
    @SequenceGenerator(
            name = "copy_seq",
            sequenceName = "copy_seq",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "copy_seq")
    private Long id;

    @OneToOne
    @JoinColumn(name="isbn", referencedColumnName = "isbn")
    private Book isbn;

    @ManyToOne
    @JoinColumn(name="lib_id", referencedColumnName = "id")
    private Library lib_id;

    public Copy() {
    }

    public Copy(Book isbn, Library lib_id) {
        this.isbn = isbn;
        this.lib_id = lib_id;
    }

    public Copy(Long id, Book isbn, Library lib_id) {
        this.id = id;
        this.isbn = isbn;
        this.lib_id = lib_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Book getIsbn() {
        return isbn;
    }

    public void setIsbn(Book isbn) {
        this.isbn = isbn;
    }

    public Library getLib_id() {
        return lib_id;
    }

    public void setLib_id(Library lib_id) {
        this.lib_id = lib_id;
    }
}
