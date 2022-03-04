package com.Profiling.Profiling.model;


import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;


@ToString
@Document(collection = "Recommendation")
public class Recommendation {
    private int idRecommendation;
    private ProfileReviews [] reviews;


    public Recommendation(int idRecommendation, ProfileReviews[] reviews) {
        this.idRecommendation = idRecommendation;
        this.reviews = reviews;
    }

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
