package com.hairglow.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String password;
    private String image;
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Routine> routines;
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<HairJournal> hairJournals ;
    @OneToOne
    @JoinColumn(name = "hair_id", referencedColumnName = "id")
    private Hair userHair;


    public User() {
    }
    public User(String name, String email, String password, String image, Routine routine, List<HairJournal> hairJournals, Hair userHair
    ) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.image = image;
        this.routines.add(routine);
        this.hairJournals = hairJournals;
        this.userHair = userHair;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Set<Routine> getRoutines() {
        return routines;
    }

    public void setRoutines(Set<Routine> routines) {
        this.routines = routines;
    }

    public List<HairJournal> getHairJournals() {
        return hairJournals;
    }

    public void setHairJournals(List<HairJournal> hairJournals) {
        this.hairJournals = hairJournals;
    }

    public Hair getUserHair() {
        return userHair;
    }

    public void setUserHair(Hair userHair) {
        this.userHair = userHair;
    }
}

