package com.Profiling.Profiling.model;

public class Categorie {
    private int id;
    private String TitleCategorie;
    private ProfileCategorie profile;

    public int getIdCategorie() {
        return id;
    }

    public void setIdCategorie(int idCategorie) {
        this.id = idCategorie;
    }

    public String getTitleCategorie() {
        return TitleCategorie;
    }

    public void setTitleCategorie(String titleCategorie) {
        TitleCategorie = titleCategorie;
    }

    public ProfileCategorie getProfile() {
        return profile;
    }

    public void setProfile(ProfileCategorie profile) {
        this.profile = profile;
    }
}
