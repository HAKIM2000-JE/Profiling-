package com.Profiling.Profiling.model;

public class ClickCategorie {
    private String id_Profile;
    private String id_Categorie;

    public ClickCategorie(String id_Profile, String id_Categorie) {
        this.id_Profile = id_Profile;
        this.id_Categorie = id_Categorie;
    }

    public String getId_Profile() {
        return id_Profile;
    }

    public void setId_Profile(String id_Profile) {
        this.id_Profile = id_Profile;
    }

    public String getId_Categorie() {
        return id_Categorie;
    }

    public void setId_Categorie(String id_Categorie) {
        this.id_Categorie = id_Categorie;
    }
}
