package com.Profiling.Profiling.api;


import com.Profiling.Profiling.model.Click;
import com.Profiling.Profiling.model.ProfileReviews;
import com.Profiling.Profiling.repository.ProfileReviewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class ClickEndpoint {

    @Autowired
    public ProfileReviewsRepository profileReviewsRepository;

    public Optional<ProfileReviews> profileReviews;



    @GetMapping("/newClick")
    public Optional<ProfileReviews> addClick(@RequestBody Click click){


        profileReviews = profileReviewsRepository.findById(click);

        profileReviews.get().setClickRecommendationCard(profileReviews.get().getClickRecommendationCard()+1);

        profileReviewsRepository.save(profileReviews.get());









        return profileReviews;

    }


    @GetMapping("/newClick/{element}")
    public Optional<ProfileReviews>  addclickByElemnt(@RequestBody Click click , @PathVariable String element){

        profileReviews = profileReviewsRepository.findById(click);


        if(element.equals("RecommendationCard")) {
            profileReviews.get().setClickRecommendationCard(profileReviews.get().getClickRecommendationCard()+1);
            profileReviewsRepository.save(profileReviews.get());
            return profileReviews;

        }else if(element.equals("RecommendationMarker") ){
            profileReviews.get().setClickRecommendationMarker(profileReviews.get().getClickRecommendationMarker() +1);
            profileReviewsRepository.save(profileReviews.get());
            return profileReviews;


        }else  if(element.equals("RecommendationWebsite")){
            profileReviews.get().setClickRecommendationWebsite(profileReviews.get().getClickRecommendationWebsite() +1);
            profileReviewsRepository.save(profileReviews.get());
            return profileReviews;


        }else if(element.equals("SyRendre")) {
            profileReviews.get().setClickSyRendre(profileReviews.get().getClickSyRendre()  +1);
            profileReviewsRepository.save(profileReviews.get());
            return profileReviews;

        }else {

            return profileReviews;
        }
















    }
}
