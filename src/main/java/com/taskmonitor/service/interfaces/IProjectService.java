package com.taskmonitor.service.interfaces;

import org.springframework.http.ResponseEntity;

import com.taskmonitor.model.entity.Project;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IProjectService {

	/****
	 * Create Project Method
	 * @param project
	 * @return
	 */
	public Mono<Project> createProject(Project project);
	
	/**
	 * 
	 * @return
	 */
	public Flux<Project> getAllProjects();
	
	

	/***
	 * 
	 * @param projectId
	 * @param project
	 * @return
	 */
	public Mono<ResponseEntity<Project>> updateProject(String projectId,Project project);
}
