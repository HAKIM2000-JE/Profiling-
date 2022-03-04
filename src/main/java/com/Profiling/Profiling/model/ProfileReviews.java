package com.Profiling.Profiling.model;

public class ProfileReviews {
    private int id_reviews;
    private boolean isClickRecommendationCard ;
    private boolean isClickRecommendationMarker;
    private boolean isClickRecommendationWebsite;
    private boolean isClickSyRendre;

    public int getId_reviews() {
        return id_reviews;
    }

    public void setId_reviews(int id_reviews) {
        this.id_reviews = id_reviews;
    }

    public boolean isClickRecommendationCard() {
        return isClickRecommendationCard;
    }

    public void setClickRecommendationCard(boolean clickRecommendationCard) {
        isClickRecommendationCard = clickRecommendationCard;
    }

    public boolean isClickRecommendationMarker() {
        return isClickRecommendationMarker;
    }

    public void setClickRecommendationMarker(boolean clickRecommendationMarker) {
        isClickRecommendationMarker = clickRecommendationMarker;
    }

    public boolean isClickRecommendationWebsite() {
        return isClickRecommendationWebsite;
    }

    public void setClickRecommendationWebsite(boolean clickRecommendationWebsite) {
        isClickRecommendationWebsite = clickRecommendationWebsite;
    }

    public boolean isClickSyRendre() {
        return isClickSyRendre;
    }

    public void setClickSyRendre(boolean clickSyRendre) {
        isClickSyRendre = clickSyRendre;
    }
}
