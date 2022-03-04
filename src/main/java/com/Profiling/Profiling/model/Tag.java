package com.Profiling.Profiling.model;

public class Tag {
    private int idTage;
    private String Title ;
    private ProfileTag profile;


    public int getIdTage() {
        return idTage;
    }

    public void setIdTage(int idTage) {
        this.idTage = idTage;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public ProfileTag getProfile() {
        return profile;
    }

    public void setProfile(ProfileTag profile) {
        this.profile = profile;
    }
}
