package com.hairglow.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "hair")
public class Hair {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int intervalDays;
    private String careDays;
    private HairProblem hairProblem;
    private TypeProduct  typeProduct;
    @OneToOne(mappedBy = "userHair", cascade = CascadeType.ALL)
    private User user;

    public enum HairProblem{
        BROKEN,DRY,LENGTH,ITCH
    }
    public enum TypeProduct {
        COMMERCIAL,HOMEMADE
    }
    private HairType hairType;
    public enum HairType{
        STRAIGHT,WAVY,CURLY,FRIZZY
    }

    public Hair(Long id, int intervalDays, String careDays, TypeProduct typeProduct, HairProblem hairProblem, HairType hairType,User user) {
        this.id = id;
        this.intervalDays = intervalDays;
        this.careDays = careDays;
        this.typeProduct = typeProduct;
        this.hairProblem = hairProblem;
        this.hairType = hairType;
        this.user = user;
    }
    public Hair() {}

    public Long getId() {
        return id;
    }

    public int getIntervalDays() {
        return intervalDays;
    }

    public void setIntervalDays(int intervalDays) {
        this.intervalDays = intervalDays;
    }

    public String getCareDays() {
        return careDays;
    }

    public void setCareDays(String careDays) {
        this.careDays = careDays;
    }

    public HairProblem getHairProblem() {
        return hairProblem;
    }

    public void setHairProblem(HairProblem hairProblem) {
        this.hairProblem = hairProblem;
    }

    public HairType getHairType() {
        return hairType;
    }

    public void setHairType(HairType hairType) {
        this.hairType = hairType;
    }

    public TypeProduct getTypeProduct() {
        return typeProduct;
    }

    public void setTypeProduct(TypeProduct typeProduct) {
        this.typeProduct = typeProduct;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
