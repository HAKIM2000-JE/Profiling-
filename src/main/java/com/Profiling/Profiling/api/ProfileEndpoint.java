package com.Profiling.Profiling.api;


import com.Profiling.Profiling.model.Profile;
import com.Profiling.Profiling.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProfileEndpoint {

    @Autowired
    public ProfileRepository profileRepository;

    @PostMapping("/newProfile")
    public  String saveProfile(@RequestBody Profile profile){
        profileRepository.save(profile);
        return "Created Profile with id : " +  profile.getId();



    }



    @GetMapping("/profiles")
    public List<Profile> getProfiles(){
        return profileRepository.findAll();

    }



    @GetMapping("/findProfile/{id}")
    public Optional<Profile> getProfile(@PathVariable int id){
        return  profileRepository.findById(id);
    }




    @DeleteMapping("/deleteProfile/{id}")
    public String deleteProfile(@PathVariable int id){
        profileRepository.deleteById(id);
        return "Profile Deleted with id " + id ;
    }

}
