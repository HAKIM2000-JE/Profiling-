package com.Profiling.Profiling.model;

public class Categorie {
    private int idCategorie;
    private String TitleCategorie;
    private ProfileCategorie profile;

    public int getIdCategorie() {
        return idCategorie;
    }

    public void setIdCategorie(int idCategorie) {
        this.idCategorie = idCategorie;
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
