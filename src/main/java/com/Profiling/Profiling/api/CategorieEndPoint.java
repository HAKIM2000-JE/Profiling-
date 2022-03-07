package com.Profiling.Profiling.api;


import com.Profiling.Profiling.model.Categorie;
import com.Profiling.Profiling.model.Profile;
import com.Profiling.Profiling.repository.CategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CategorieEndPoint {


     @Autowired
     public CategorieRepository categorieRepository;

    @PostMapping("/newCategorie")
    public  void saveCategorie(@RequestBody Categorie categorie){
        categorieRepository.save(categorie);
        //return "Created Profile with id : " +  profile.getId();
    }



    @GetMapping("/categories")
    public List<Categorie> getCategorie(){
        return categorieRepository.findAll();

    }



    @GetMapping("/findCategorie/{id}")
    public Optional<Categorie> getCategorie(@PathVariable int id){
        return  categorieRepository.findById(id);
    }




    @DeleteMapping("/deleteCategorie/{id}")
    public String deleteCategorie(@PathVariable int id){
        categorieRepository.deleteById(id);
        return "Categorie deleted with " + id ;
    }

}
