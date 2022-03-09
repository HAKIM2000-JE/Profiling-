package com.Profiling.Profiling.api;


import com.Profiling.Profiling.model.Click;
import com.Profiling.Profiling.model.ProfileCategorie;
import com.Profiling.Profiling.model.ProfileReviews;
import com.Profiling.Profiling.model.ProfileTag;
import com.Profiling.Profiling.repository.ProfileCategorieRepository;
import com.Profiling.Profiling.repository.ProfileReviewsRepository;
import com.Profiling.Profiling.repository.ProfileTagRepository;
import com.Profiling.Profiling.service.ClicksIncr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin
public class ClickEndpoint {

    @Autowired
    public ProfileReviewsRepository profileReviewsRepository;

    @Autowired
    public ProfileCategorieRepository profileCategorieRepository;

    @Autowired
    public ProfileTagRepository profileTagRepository;

    public Optional<ProfileReviews> profileReviews;

    public Optional<ProfileCategorie> profileCategorie;

    public Optional<ProfileTag> profileTag;

    @Autowired
    public ClicksIncr clicksIncr;



    @GetMapping("/newClick")
    public Optional<ProfileReviews> addClick(@RequestBody Click click){


        profileReviews = profileReviewsRepository.findById(click);

        profileReviews.get().setClickRecommendationCard(profileReviews.get().getClickRecommendationCard()+1);

        profileReviewsRepository.save(profileReviews.get());

        return profileReviews;

    }


    @PostMapping("/newClick/{element}")
    public Optional<ProfileReviews>  addclickByElemnt(@RequestBody Click click , @PathVariable String element){

        profileReviews = profileReviewsRepository.findById(click);

        clicksIncr.incrementClick(profileReviews , element  );



        profileReviewsRepository.save(profileReviews.get());

        System.out.println("received Request");
        return profileReviews;

    }

    @PostMapping("/newClickCategorie")
    public Optional<ProfileCategorie> addCategorie(@RequestBody Click click){
        profileCategorie = profileCategorieRepository.findById(click);

        clicksIncr.incrementClickCategorie(profileCategorie);

        profileCategorieRepository.save(profileCategorie.get());

        return profileCategorie;

    }

    @PostMapping("/newClickTag")
     public Optional<ProfileTag>addTag(@RequestBody Click click){
        profileTag= profileTagRepository.findById(click);
        clicksIncr.incrementClickTag(profileTag);
        profileTagRepository.save(profileTag.get());
        return profileTag;

     }

}
