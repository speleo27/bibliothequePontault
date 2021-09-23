package com.biblio.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import javax.validation.constraints.NotNull;



@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
@Setter
@Builder
@Entity
@Table(name = "editor")
@Getter
public class Editor {
    @Id
    @SequenceGenerator(
            name = "editor_seq",
            sequenceName = "editor_seq",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "editor_seq")
    private Long id;

    @Basic(optional = false)
    @Column(name = "editorname")
    private String editor_name;

    public Editor() {
    }

    public Editor(String editor_name) {
        this.editor_name = editor_name;
    }

    public Editor(Long id, String editor_name) {

        this.id = id;
        this.editor_name = editor_name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEditor_name() {
        return editor_name;
    }

    public void setEditor_name(String editor_name) {
        this.editor_name = editor_name;
    }
}