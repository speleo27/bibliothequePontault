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
@Table(name="library")

public class Library {
    @Id
    @SequenceGenerator(
            name = "lib_seq",
            sequenceName = "lib_seq",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "lib_seq")
    private Long id;

    @Basic(optional = false)
    @Column(name="lib_name")
    private String lib_name;

    public Library() {
    }

    public Library(String lib_name) {
        this.lib_name = lib_name;
    }

    public Library(Long id, String lib_name) {
        this.id = id;
        this.lib_name = lib_name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLib_name() {
        return lib_name;
    }

    public void setLib_name(String lib_name) {
        this.lib_name = lib_name;
    }
}
