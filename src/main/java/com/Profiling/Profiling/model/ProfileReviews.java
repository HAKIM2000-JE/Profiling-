package com.Profiling.Profiling.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "GuestReviews")
public class ProfileReviews {


    private int id_reviews;
    @Id
    private Click click;
    private int clickRecommendationCard ;
    private int  clickRecommendationMarker;
    private int clickRecommendationWebsite;
    private int  clickSyRendre;
    private boolean clickNavigation;

    public ProfileReviews(int id_reviews, Click click,  int clickRecommendationCard, int clickRecommendationMarker, int clickRecommendationWebsite, int clickSyRendre  , boolean clickNavigation) {
        this.id_reviews = id_reviews;
        this.click = click;
        this.clickRecommendationCard = clickRecommendationCard;
        this.clickRecommendationMarker = clickRecommendationMarker;
        this.clickRecommendationWebsite = clickRecommendationWebsite;
        this.clickSyRendre = clickSyRendre;
        this.clickNavigation= clickNavigation;
    }

    public int getId_reviews() {
        return id_reviews;
    }

    public void setId_reviews(int id_reviews) {
        this.id_reviews = id_reviews;
    }

    public Click getClick() {
        return click;
    }

    public void setClick(Click click) {
        this.click = click;
    }

    public int getClickRecommendationCard() {
        return clickRecommendationCard;
    }

    public void setClickRecommendationCard(int clickRecommendationCard) {
        this.clickRecommendationCard = clickRecommendationCard;
    }

    public int getClickRecommendationMarker() {
        return clickRecommendationMarker;
    }

    public void setClickRecommendationMarker(int clickRecommendationMarker) {
        this.clickRecommendationMarker = clickRecommendationMarker;
    }

    public int getClickRecommendationWebsite() {
        return clickRecommendationWebsite;
    }

    public void setClickRecommendationWebsite(int clickRecommendationWebsite) {
        this.clickRecommendationWebsite = clickRecommendationWebsite;
    }

    public int getClickSyRendre() {
        return clickSyRendre;
    }

    public void setClickSyRendre(int clickSyRendre) {
        this.clickSyRendre = clickSyRendre;
    }

    public boolean isClickNavigation() {
        return clickNavigation;
    }

    public void setClickNavigation(boolean clickNavigation) {
        this.clickNavigation = clickNavigation;
    }
}
