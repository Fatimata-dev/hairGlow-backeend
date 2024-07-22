package com.hairglow.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "step")
public class Steps {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String description;
    @ManyToOne
    private Recipe recipe;

    @ManyToOne
    private Routine routine;




    public Steps() {
    }
    public Steps(String name, String description, Recipe recipe, Routine routine) {
        this.name = name;
        this.description = description;
        this.recipe = recipe;
        this.routine = routine;
    }
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public Routine getRoutine() {
        return routine;
    }

    public void setRoutine(Routine routine) {
        this.routine = routine;
    }
}
