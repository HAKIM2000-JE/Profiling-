package com.Profiling.Profiling.repository;

import com.Profiling.Profiling.model.Tag;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TagRepository extends MongoRepository<Tag , Integer> {

}
