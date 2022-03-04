package com.Profiling.Profiling.model;


import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@ToString
@Document(collection = "Categorie")
public class Categorie {

    @Id
    private int id;
    private String titleCategorie;
    private ProfileCategorie profile;

    public Categorie(int id, String titleCategorie, ProfileCategorie profile) {
        this.id = id;
        this.titleCategorie = titleCategorie;
        this.profile = profile;
    }

    public int getIdCategorie() {
        return id;
    }

    public void setIdCategorie(int idCategorie) {
        this.id = idCategorie;
    }

    public String getTitleCategorie() {
        return titleCategorie;
    }

    public void setTitleCategorie(String titleCategorie) {
        this.titleCategorie = titleCategorie;
    }

    public ProfileCategorie getProfile() {
        return profile;
    }

    public void setProfile(ProfileCategorie profile) {
        this.profile = profile;
    }
}
