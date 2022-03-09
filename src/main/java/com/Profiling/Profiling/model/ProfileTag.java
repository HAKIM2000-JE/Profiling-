package com.Profiling.Profiling.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ProfileTag")
public class ProfileTag {

    @Id
    private   Click click;

    private int clickOnTag;

    public ProfileTag(Click click, int clickOnTag) {
        this.click = click;
        this.clickOnTag = clickOnTag;
    }

    public Click getClick() {
        return click;
    }

    public void setClick(Click click) {
        this.click = click;
    }

    public int getClickOnTag() {
        return clickOnTag;
    }

    public void setClickOnTag(int clickOnTag) {
        this.clickOnTag = clickOnTag;
    }
}
