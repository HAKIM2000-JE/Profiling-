package com.Profiling.Profiling.api;


import com.Profiling.Profiling.model.ProfileCategorie;
import com.Profiling.Profiling.model.ProfileTag;
import com.Profiling.Profiling.repository.ProfileTagRepository;
import com.Profiling.Profiling.repository.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class ProfieTagEndpoint {



    @Autowired
    public ProfileTagRepository profileTagRepository;


    @PostMapping("/ProfileTag")
    public ProfileTag saveProfileTag (@RequestBody ProfileTag profileTag){
        if(  profileTagRepository.findById(profileTag.getClick()).isPresent() ){
            System.out.println(profileTag.getClick().getId_Recommendation());

            System.out.println("ProfileTag already exist ");
            return profileTag ;
        }else {
            profileTagRepository.save(profileTag);
            return profileTag;
        }
    }


}
