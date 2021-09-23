package com.biblio.model;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.checkerframework.checker.i18nformatter.qual.I18nFormat;

import javax.persistence.*;



@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
@Getter
@Setter
@Builder
@Entity
@Table(name = "language")
public class Language {
    @Id
    @SequenceGenerator(
            name = "lang_seq",
            sequenceName = "lang_seq",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "lang_seq")
    private Long id;

    @Basic(optional = false)
    @Column(name="lang_name")
    private String lang_name;

    public Language() {
    }

    public Language(String lang_name) {
        this.lang_name = lang_name;
    }

    public Language(Long id, String lang_name) {
        this.id =id;
        this.lang_name = lang_name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLang_name() {
        return lang_name;
    }

    public void setLang_name(String lang_name) {
        this.lang_name = lang_name;
    }
}
