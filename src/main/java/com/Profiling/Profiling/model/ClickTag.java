package com.Profiling.Profiling.model;

public class ClickTag {

    private String id_Profile;
    private String id_Tag;


    public ClickTag(String id_Profile, String id_Tag) {
        this.id_Profile = id_Profile;
        this.id_Tag = id_Tag;
    }

    public String getId_Profile() {
        return id_Profile;
    }

    public void setId_Profile(String id_Profile) {
        this.id_Profile = id_Profile;
    }

    public String getId_Tag() {
        return id_Tag;
    }

    public void setId_Tag(String id_Tag) {
        this.id_Tag = id_Tag;
    }
}
