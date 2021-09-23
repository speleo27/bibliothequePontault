package com.biblio.model;


import java.util.Date;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;



@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
@Getter
@Setter
@Builder
@Entity
@Table(name = "book", indexes = {
        @Index(name = "idx_book_editor_id", columnList = "editor_id")
})

public class Book {
    @Id
    @SequenceGenerator(
            name = "book_seq",
            sequenceName = "book_seq",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "book_seq")
    private Long id;

    @Basic(optional = false)
    @Column(name = "title")
    private String title;

    @Basic(optional= false)
    @Column(name = "isbn")
    private String isbn;

    @Basic(optional = false)
    @Temporal(TemporalType.TIMESTAMP)
    @Column (name="publish_date")
    private Date publishDate;

    @ManyToOne
    @JoinColumn(name="editor_id",referencedColumnName = "id")
    private Editor editor_id;

    @ManyToOne
    @JoinColumn(name="description_id", referencedColumnName = "id")
    private Description descriptionId;


    public Book() {
    }

    public Book(Long id, String title, String isbn, Date publishDate, Editor editor_id, Description descriptionId) {
        this.id = id;
        this.title = title;
        this.isbn = isbn;
        this.publishDate = publishDate;
        this.editor_id = editor_id;
        this.descriptionId = descriptionId;
    }

    public Book(String title, String isbn, Date publishDate, Editor editor_id, Description descriptionId) {
        this.title = title;
        this.isbn = isbn;
        this.publishDate = publishDate;
        this.editor_id = editor_id;
        this.descriptionId = descriptionId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Editor getEditor_id() {
        return editor_id;
    }

    public void setEditor_id(Editor editor_id) {
        this.editor_id = editor_id;
    }

    public Description getDescriptionId() {
        return descriptionId;
    }

    public void setDescriptionId(Description descriptionId) {
        this.descriptionId = descriptionId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }
}
