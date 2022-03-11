package com.Profiling.Profiling.api;



import com.Profiling.Profiling.model.ProfileReviews;
import com.Profiling.Profiling.repository.ProfileReviewsRepository;
import com.Profiling.Profiling.service.ClicksIncr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;


@RestController
@CrossOrigin
public class ProfileReviewsEndpoint {

     @Autowired
     public  ProfileReviewsRepository profileReviewsRepository;


    @Autowired
    public ClicksIncr clicksIncr;



    public Optional<ProfileReviews> ExistingProfileReviews;


    @PostMapping("/ProfileReview/{element}")
    public  ProfileReviews saveProfileReview(@RequestBody ProfileReviews profileReviews ,@PathVariable String element  ){



        if(  profileReviewsRepository.findById(profileReviews.getClick()).isPresent() ){
             //we have to increment click
            ExistingProfileReviews = profileReviewsRepository.findById( profileReviews.getClick() );
            clicksIncr.incrementClick(ExistingProfileReviews.get() , element  );
            profileReviewsRepository.save(ExistingProfileReviews.get());

            return ExistingProfileReviews.get() ;
        }else {
            clicksIncr.incrementClick(profileReviews , element  );
            profileReviewsRepository.save(profileReviews);
            return profileReviews;
        }






    }



}







