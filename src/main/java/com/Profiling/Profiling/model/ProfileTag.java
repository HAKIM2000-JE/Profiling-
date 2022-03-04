package com.Profiling.Profiling.model;


import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ProfileTag")
public class ProfileTag {
    private boolean isClickOnTag;


    public ProfileTag(boolean isClickOnTag) {
        this.isClickOnTag = isClickOnTag;
    }

    public boolean isClickOnTag() {
        return isClickOnTag;
    }

    public void setClickOnTag(boolean clickOnTag) {
        isClickOnTag = clickOnTag;
    }
}
