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
@Table(name="rent")

public class Rent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Basic(optional = false)
    @Column(name="date_start")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date_start;

    @Basic(optional = false)
    @Column(name="date_end")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date_end;

    @Basic
    @Column(name="renew")
    private boolean renew;

    @ManyToOne
    @JoinColumn(name="user_id", referencedColumnName = "id")
    private User user_id;

    @ManyToOne
    @JoinColumn(name="copy_id", referencedColumnName = "id")
    private Copy copy_id;

    public Rent(int id, Date date_start, Date date_end, boolean renew, User user_id, Copy copy_id) {
        this.id = id;
        this.date_start = date_start;
        this.date_end = date_end;
        this.renew = renew;
        this.user_id = user_id;
        this.copy_id = copy_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate_start() {
        return date_start;
    }

    public void setDate_start(Date date_start) {
        this.date_start = date_start;
    }

    public Date getDate_end() {
        return date_end;
    }

    public void setDate_end(Date date_end) {
        this.date_end = date_end;
    }

    public boolean isRenew() {
        return renew;
    }

    public void setRenew(boolean renew) {
        this.renew = renew;
    }

    public User getUser_id() {
        return user_id;
    }

    public void setUser_id(User user_id) {
        this.user_id = user_id;
    }

    public Copy getCopy_id() {
        return copy_id;
    }

    public void setCopy_id(Copy copy_id) {
        this.copy_id = copy_id;
    }
}
