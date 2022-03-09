package com.Profiling.Profiling.api;


import com.Profiling.Profiling.model.ProfileCategorie;
import com.Profiling.Profiling.repository.ProfileCategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class ProfileCategorieEndpoint {

    @Autowired
    public ProfileCategorieRepository profileCategorieRepository;

    @PostMapping("/ProfileCategorie")
    public ProfileCategorie saveProfileCategory (@RequestBody ProfileCategorie profileCategorie){
        if(  profileCategorieRepository.findById(profileCategorie.getClick()).isPresent() ){
            System.out.println(profileCategorie.getClick().getId_Recommendation());

            System.out.println("ProfileTag already exist");
            return profileCategorie ;
        }else {
            profileCategorieRepository.save(profileCategorie);
            return profileCategorie;
        }
    }
}
