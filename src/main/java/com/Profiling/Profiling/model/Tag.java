package com.Profiling.Profiling.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.CollectionCallback;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Tag")
public class Tag {

    @Id
    private int idTage;
    private String Title ;
    private ProfileTag profile;

    public Tag(int idTage, String title, ProfileTag profile) {
        this.idTage = idTage;
        Title = title;
        this.profile = profile;
    }

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
