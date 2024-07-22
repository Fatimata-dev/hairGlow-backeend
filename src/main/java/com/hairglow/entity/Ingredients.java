package com.hairglow.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="ingredient")
public class Ingredients {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany(mappedBy = "ingredients")
    private List<Recipe> recipes;

    public Ingredients() {}
    public Ingredients(String name, List<Recipe> recipes) {
        this.name = name;
        this.recipes = recipes;
    }
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(List<Recipe> recipes) {
        this.recipes = recipes;
    }
}
