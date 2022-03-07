package com.Profiling.Profiling.model;


import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@ToString
@Document(collection = "Profile")
public class Profile {

    @Id
    private int id;
    private int age;
    private String gendre;
    private String situation_familiale;
    private String language;
    private int adults;
    private int pets;
    private int children;
    private int bebes;
    private ProfileReviews [] reviews;
    private Categorie [] categories;
    private ProfileTag [] tags;

    public Profile(int id, int age, String situation_familiale, String language, int adults, int pets, int children, int bebes) {
        this.id = id;
        this.age = age;
        this.situation_familiale = situation_familiale;
        this.language = language;
        this.adults = adults;
        this.pets = pets;
        this.children = children;
        this.bebes = bebes;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSituation_familiale() {
        return situation_familiale;


    }

    public void setSituation_familiale(String situation_familiale) {
        this.situation_familiale = situation_familiale;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getAdults() {
        return adults;
    }

    public void setAdults(int adults) {
        this.adults = adults;
    }

    public int getPets() {
        return pets;
    }

    public void setPets(int pets) {
        this.pets = pets;
    }

    public int getChildren() {
        return children;
    }

    public void setChildren(int children) {
        this.children = children;
    }

    public int getBebes() {
        return bebes;
    }

    public void setBebes(int bebes) {
        this.bebes = bebes;
    }


}
