package com.biblio.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
@Setter
@Builder
@Entity
@Table(name = "editor")
@Getter
public class Editor {
    @Id
    @GeneratedValue
    private int id;

    @Basic(optional = false)
    @Column(name = "editorname")
    private String editor_name;

    public Editor(int id,String editor_name) {

        this.id = id;
        this.editor_name = editor_name;
    }

    public String getEditor_name() {
        return editor_name;
    }

    public void setEditor_name(String editor_name) {
        this.editor_name = editor_name;
    }
}