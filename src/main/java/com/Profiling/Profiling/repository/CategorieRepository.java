package com.Profiling.Profiling.repository;

import com.Profiling.Profiling.model.Categorie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieRepository extends MongoRepository<Categorie , Integer> {
}
