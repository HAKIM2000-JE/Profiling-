package com.Profiling.Profiling.repository;

import com.Profiling.Profiling.model.Click;
import com.Profiling.Profiling.model.ClikcTag;
import com.Profiling.Profiling.model.ProfileTag;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProfileTagRepository extends MongoRepository<ProfileTag, ClikcTag> {
}
