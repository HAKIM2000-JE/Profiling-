package com.Profiling.Profiling.model;

public class Recommendation {
    private int idRecommendation;
    private ProfileReviews [] reviews;

    public int getIdRecommendation() {
        return idRecommendation;
    }

    public void setIdRecommendation(int idRecommendation) {
        this.idRecommendation = idRecommendation;
    }

    public ProfileReviews[] getReviews() {
        return reviews;
    }

    public void setReviews(ProfileReviews[] reviews) {
        this.reviews = reviews;
    }
}
