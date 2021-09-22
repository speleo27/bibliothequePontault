package com.biblio.model;


import java.util.Date;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import javax.validation.constraints.Email;

@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
@Getter
@Setter
@Builder
@Entity
@Table(name="copy")

public class Copy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    @JoinColumn(name="isbn", referencedColumnName = "isbn")
    private Book isbn;

    @ManyToOne
    @JoinColumn(name="lib_id", referencedColumnName = "id")
    private Library lib_id;
}
