package com.biblio.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;


@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
@Getter
@Setter
@Builder
@Entity
@Table(name = "type")

public class Type {
    
    @Id
    @SequenceGenerator(
            name = "type_seq",
            sequenceName = "type_seq",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "type_seq")
    private Long id;
    
    @Basic(optional = false)
    @Column(name="type_name")
    private String type_name;

    public Type() {
    }

    public Type(String type_name) {
        this.type_name = type_name;
    }

    public Type(Long id, String type_name) {
        this.id =id;
        this.type_name = type_name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType_name() {
        return type_name;
    }

    public void setType_name(String type_name) {
        this.type_name = type_name;
    }

    @Override
    public String toString() {
        return "Type{" +
                "id=" + id +
                ", type_name='" + type_name + '\'' +
                '}';
    }
}
