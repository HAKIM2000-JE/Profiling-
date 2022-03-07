package com.Profiling.Profiling.repository;

import com.Profiling.Profiling.model.Click;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ClickRepository extends MongoRepository<Click, Integer> {
}
