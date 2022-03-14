package com.Profiling.Profiling.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "GuestTag")
public class ProfileTag {

    @Id
    private ClickTag click;

    private int clickOnTag;

    public ProfileTag(ClickTag click, int clickOnTag) {
        this.click = click;
        this.clickOnTag = clickOnTag;
    }

    public ClickTag getClick() {
        return click;
    }

    public void setClick(ClickTag click) {
        this.click = click;
    }

    public int getClickOnTag() {
        return clickOnTag;
    }

    public void setClickOnTag(int clickOnTag) {
        this.clickOnTag = clickOnTag;
    }
}
