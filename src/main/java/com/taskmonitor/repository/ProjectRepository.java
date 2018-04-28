package com.taskmonitor.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.taskmonitor.model.entity.Project;


/**
 * @author sree
 *
 */
@Repository
public interface ProjectRepository extends ReactiveMongoRepository<Project, String> {

}

