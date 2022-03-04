package com.Profiling.Profiling.repository;

import com.Profiling.Profiling.model.Profile;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProfileRepository extends MongoRepository<Profile, Integer> {
}
