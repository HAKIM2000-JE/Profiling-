package com.Profiling.Profiling.model;


import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@ToString
@Document(collection = "Profile")
public class Profile {

    @Id
    private String id;
    private int age;
    private String gendre;

    private String language;
    private int adults;
    private int pets;
    private int children;
    private int babies;
    private int sofabeds;
    private int singlebeds;
    private int doublebeds;
    private String startDate;
    private String endDate;
    private ProfileReviews [] reviews;
    private Categorie [] categories;
    private ProfileTag [] tags;

    public Profile(String id, int age, String gendre, String language, int adults, int pets, int children, int babies, int sofabeds, int singlebeds, int doublebeds, String startDate, String endDate) {
        this.id = id;
        this.age = age;
        this.gendre = gendre;
        this.language = language;
        this.adults = adults;
        this.pets = pets;
        this.children = children;
        this.babies = babies;
        this.sofabeds = sofabeds;
        this.singlebeds = singlebeds;
        this.doublebeds = doublebeds;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getGendre() {
        return gendre;
    }

    public void setGendre(String gendre) {
        this.gendre = gendre;
    }

    public int getBabies() {
        return babies;
    }

    public void setBabies(int babies) {
        this.babies = babies;
    }

    public int getSofabeds() {
        return sofabeds;
    }

    public void setSofabeds(int sofabeds) {
        this.sofabeds = sofabeds;
    }

    public int getSinglebeds() {
        return singlebeds;
    }

    public void setSinglebeds(int singlebeds) {
        this.singlebeds = singlebeds;
    }

    public int getDoublebeds() {
        return doublebeds;
    }

    public void setDoublebeds(int doublebeds) {
        this.doublebeds = doublebeds;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
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
        return babies;
    }

    public void setBebes(int bebes) {
        this.babies = bebes;
    }


}
