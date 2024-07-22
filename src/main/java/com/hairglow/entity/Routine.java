package com.hairglow.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "routine")
public class Routine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String routineName;
    private String description;
    @ManyToOne()
    private User user;

    @OneToMany(mappedBy = "routine")
    @JsonIgnore
    private List<Steps> steps;

    public Routine() {
    }

    public Routine(Long id, String routineName, String description, User user) {
        this.id = id;
        this.routineName = routineName;
        this.description = description;
        this.user = user;
    }

    public String getRoutineName() {
        return routineName;
    }

    public void setRoutineName(String routineName) {
        this.routineName = routineName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Steps> getSteps() {
        return steps;
    }

    public void setSteps(List<Steps> steps) {
        this.steps = steps;
    }

    public Long getId() {
        return id;
    }

}
