package com.Profiling.Profiling.repository;

import com.Profiling.Profiling.model.Click;
import com.Profiling.Profiling.model.ProfileReviews;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProfileReviewsRepository extends MongoRepository<ProfileReviews , Click> {


}
