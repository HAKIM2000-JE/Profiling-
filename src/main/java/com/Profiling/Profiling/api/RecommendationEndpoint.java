package com.Profiling.Profiling.api;


import com.Profiling.Profiling.model.Profile;
import com.Profiling.Profiling.model.Recommendation;
import com.Profiling.Profiling.repository.ReccommendationRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class RecommendationEndpoint {


    public ReccommendationRepository reccommendationRepository;

    @PostMapping("/newRecommendation")
    public  String saveRecommendation(@RequestBody Recommendation recommendation){
        reccommendationRepository.save(recommendation);
        return "Created Recommendation with id : " +  recommendation.getIdRecommendation();



    }



    @GetMapping("/Recommendations")
    public List<Recommendation> getRecommendations(){
        return reccommendationRepository.findAll();

    }



    @GetMapping("/findRecommendation/{id}")
    public Optional<Recommendation> getRecommendation(@PathVariable int id){
        return  reccommendationRepository.findById(id);
    }




    @DeleteMapping("/deleteRecommendation/{id}")
    public String deleteRecommendation(@PathVariable int id){
        reccommendationRepository.deleteById(id);
        return "Recommendation Deleted with id " + id ;
    }
}
