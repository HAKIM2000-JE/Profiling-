package com.Profiling.Profiling.service;


import com.Profiling.Profiling.model.ProfileReviews;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Component
public class ClicksIncr {


    public void  incrementClick(Optional<ProfileReviews> profileReviews , String element){


        if(element.equals("RecommendationCard")) {
            profileReviews.get().setClickRecommendationCard(profileReviews.get().getClickRecommendationCard()+1);


        }else if(element.equals("RecommendationMarker") ){
            profileReviews.get().setClickRecommendationMarker(profileReviews.get().getClickRecommendationMarker() +1);


        }else  if(element.equals("RecommendationWebsite")){
            profileReviews.get().setClickRecommendationWebsite(profileReviews.get().getClickRecommendationWebsite() +1);



        }else if(element.equals("SyRendre")) {
            profileReviews.get().setClickSyRendre(profileReviews.get().getClickSyRendre()  +1);


        }



    }


}
