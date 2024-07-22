package com.hairglow.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "journal")
public class HairJournal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date date;
    private String hairCondition;
    private String notes;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.REFRESH, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public HairJournal() {
    }

    public HairJournal(Long id, Date date, String hairCondition, String notes, User user) {
        this.id = id;
        this.date = date;
        this.hairCondition = hairCondition;
        this.notes = notes;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getHairCondition() {
        return hairCondition;
    }

    public void setHairCondition(String hairCondition) {
        this.hairCondition = hairCondition;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
