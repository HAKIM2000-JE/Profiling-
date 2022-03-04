package com.Profiling.Profiling.repository;

import jdk.jfr.Registered;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface Reccommendation extends MongoRepository<Reccommendation , Integer> {
}
