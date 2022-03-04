package com.Profiling.Profiling.api;


import com.Profiling.Profiling.model.Profile;
import com.Profiling.Profiling.model.Tag;
import com.Profiling.Profiling.repository.TagRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TagEndPoint {

    public TagRepository tagRepository;


    @PostMapping("/newTag")
    public  String saveTag(@RequestBody Tag tag){
        tagRepository.save(tag);
        return "Created Tag with id : " +  tag.getIdTage();



    }



    @GetMapping("/tags")
    public List<Tag> getTags(){
        return tagRepository.findAll();

    }



    @GetMapping("/findTag/{id}")
    public Optional<Tag> getTag(@PathVariable int id){
        return  tagRepository.findById(id);
    }




    @DeleteMapping("/deleteTag/{id}")
    public String deleteTag(@PathVariable int id){
        tagRepository.deleteById(id);
        return "Tag Deleted with id " + id ;
    }
}
