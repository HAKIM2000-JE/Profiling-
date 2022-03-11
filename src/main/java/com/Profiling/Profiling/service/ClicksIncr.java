package com.Profiling.Profiling.service;


import com.Profiling.Profiling.model.ProfileCategorie;
import com.Profiling.Profiling.model.ProfileReviews;
import com.Profiling.Profiling.model.ProfileTag;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Component
public class ClicksIncr {


    public void  incrementClick(ProfileReviews profileReviews , String element){


        if(element.equals("RecommendationCard")) {
            profileReviews.setClickRecommendationCard(profileReviews.getClickRecommendationCard()+1);


        }else if(element.equals("RecommendationMarker") ){
            profileReviews.setClickRecommendationMarker(profileReviews.getClickRecommendationMarker() +1);


        }else  if(element.equals("RecommendationWebsite")){
            profileReviews.setClickRecommendationWebsite(profileReviews.getClickRecommendationWebsite() +1);



        }else if(element.equals("SyRendre")) {
            profileReviews.setClickSyRendre(profileReviews.getClickSyRendre()  +1);


        }



    }


    public void incrementClickCategorie(ProfileCategorie profileCategorie){

        profileCategorie.setClickOnCategorie(profileCategorie.getClickOnCategorie() +1);

    }

    public void incrementClickTag(ProfileTag profileTag ){
        profileTag.setClickOnTag(profileTag.getClickOnTag()+1);
    }

}
