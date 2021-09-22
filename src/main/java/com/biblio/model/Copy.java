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
@Table(name="copy")

public class Copy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    @JoinColumn(name="isbn", referencedColumnName = "isbn")
    private Book isbn;

    @ManyToOne
    @JoinColumn(name="lib_id", referencedColumnName = "id")
    private Library lib_id;

    public Copy(int id, Book isbn, Library lib_id) {
        this.id = id;
        this.isbn = isbn;
        this.lib_id = lib_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
