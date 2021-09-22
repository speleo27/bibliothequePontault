package com.biblio.model;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.checkerframework.checker.i18nformatter.qual.I18nFormat;

import javax.persistence.*;


@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
@Getter
@Setter
@Builder
@Entity
@Table(name = "language")
public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Basic(optional = false)
    @Column(name="lang_name")
    private String lang_name;

    public Language(int id, String lang_name) {
        this.id =id;
        this.lang_name = lang_name;
    }

    public String getLang_name() {
        return lang_name;
    }

    public void setLang_name(String lang_name) {
        this.lang_name = lang_name;
    }
}
