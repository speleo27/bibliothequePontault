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
@Table(name = "description")
public class Description {

    @Id
    @SequenceGenerator(
            name = "desc_seq",
            sequenceName = "desc_seq",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "desc_seq")
    private Long id;

    @Basic(optional = false)
    @Column(name="desc_title")
    private String title;

    public Description() {
    }

    public Description(String title) {
        this.title = title;
    }

    public Description(Long id, String title) {
        this.id = id;
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
