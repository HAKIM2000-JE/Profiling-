package com.Profiling.Profiling.api;


import ch.qos.logback.core.net.SyslogOutputStream;
import com.Profiling.Profiling.model.Click;
import com.Profiling.Profiling.model.Profile;
import com.Profiling.Profiling.model.ProfileReviews;
import com.Profiling.Profiling.model.Recommendation;
import com.Profiling.Profiling.repository.ProfileRepository;
import com.Profiling.Profiling.repository.ProfileReviewsRepository;
import com.Profiling.Profiling.repository.ReccommendationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ProfileReviewsEndpoint {

     @Autowired
     public  ProfileReviewsRepository profileReviewsRepository;



    @GetMapping("/AllProfileReviews")
    public List<ProfileReviews> addClick(){

            return profileReviewsRepository.findAll();

    }


    @PostMapping("/ProfileReview")
    public  String saveProfileReview(@RequestBody ProfileReviews profileReviews){
        profileReviewsRepository.save(profileReviews);
        return "Created Recommendation with id : " +  profileReviews.getClick() ;



    }



}







