package com.Profiling.Profiling.repository;

import com.Profiling.Profiling.model.Recommendation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ReccommendationRepository extends MongoRepository<Recommendation , Integer> {

}
