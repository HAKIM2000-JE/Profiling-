package com.Profiling.Profiling.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "GuestTag")
public class ProfileTag {

    @Id
    private   ClikcTag click;

    private int clickOnTag;

    public ProfileTag(ClikcTag click, int clickOnTag) {
        this.click = click;
        this.clickOnTag = clickOnTag;
    }

    public ClikcTag getClick() {
        return click;
    }

    public void setClick(ClikcTag click) {
        this.click = click;
    }

    public int getClickOnTag() {
        return clickOnTag;
    }

    public void setClickOnTag(int clickOnTag) {
        this.clickOnTag = clickOnTag;
    }
}
