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
@Table(name = "paragraph")
public class Paragraph {

    @Id
    @SequenceGenerator(
            name = "para_seq",
            sequenceName = "para_seq",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "para_seq")
    private Long id;

    @Basic(optional = false)
    @Column(name="paragraph_order")
    private Long order;

    @Basic(optional = false)
    @Column(name="texte")
    private String content;

    public Paragraph() {
    }

    public Paragraph(Long order, String content) {
        this.order = order;
        this.content = content;
    }

    public Paragraph(Long id, Long order, String content) {
        this.id =id;
        this.order = order;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrder() {
        return order;
    }

    public void setOrder(Long order) {
        this.order = order;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
