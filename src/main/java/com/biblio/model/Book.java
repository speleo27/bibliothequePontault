package com.biblio.model;

import java.util.Date;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;


@AllArgsConstructor
@NoArgsConstructor
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Basic(optional = false)
    @Column(name = "title")
    private String title;

    @Basic(optional= false)
    @Column(name = "isbn")
    private String isbn;

    @Basic(optional = false)
    @Temporal(TemporalType.TIMESTAMP)
    @Column (name="publish_date")
    @Transient
    private Date publishDate;

    @ManyToOne
    @JoinColumn(name="editor_id",referencedColumnName = "id")
    private Editor editor_id;

    @ManyToOne
    @JoinColumn(name="description_id", referencedColumnName = "id")
    private Description descriptionId;


    public Book(String title, String isbn, Date publishDate) {
        this.title = title;
        this.isbn = isbn;
        this.publishDate = publishDate;
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
