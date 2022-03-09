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
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@CrossOrigin
public class ProfileReviewsEndpoint {

     @Autowired
     public  ProfileReviewsRepository profileReviewsRepository;

    public Optional<ProfileReviews> ExistingProfile;



    @GetMapping("/AllProfileReviews")
    public List<ProfileReviews> addClick(){

            return profileReviewsRepository.findAll();

    }


    @PostMapping("/ProfileReview")
    public  ProfileReviews saveProfileReview(@RequestBody ProfileReviews profileReviews){

         if(  profileReviewsRepository.findById(profileReviews.getClick()).isPresent() ){
             System.out.println(profileReviews.getClick().getId_Recommendation());

             System.out.println("ProfileReviews already exist ");
             return profileReviews ;
         }else {
             profileReviewsRepository.save(profileReviews);
             return profileReviews;
         }



         /*if(ExistingProfile.get().equals(null)){
             profileReviewsRepository.save(profileReviews);
             return "Created Recommendation with id : " +  profileReviews.getClick() ;

         }else {
             return "ProfileReviews already exist ";
         }*/





    }



}







