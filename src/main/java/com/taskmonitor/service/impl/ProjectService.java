/**
 * 
 */
package com.taskmonitor.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.taskmonitor.model.entity.Project;
import com.taskmonitor.repository.ProjectRepository;
import com.taskmonitor.service.interfaces.IProjectService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author sree
 *
 */
@Service
public class ProjectService implements IProjectService {

	@Autowired
	ProjectRepository projectRepository;

	@Override
	public Mono<Project> createProject(Project project) {
		return projectRepository.save(project);
	}

	@Override
	public Flux<Project> getAllProjects() {
		return projectRepository.findAll();
	}

	@Override
	public Mono<ResponseEntity<Project>> updateProject(String projectId, Project project) {
		
		return projectRepository.findById(projectId)
					.flatMap(existingProject -> {
						if(project.getProjectStartDate() != null)existingProject.setProjectStartDate(project.getProjectStartDate());
						if(project.getProjectEndDate() != null)existingProject.setProjectEndDate(project.getProjectEndDate());
						if(project.getProjectName() != null)existingProject.setProjectName(project.getProjectName());
						if(project.getProjectStatus() != null)existingProject.setProjectStatus(project.getProjectStatus());
						if(project.getProjectteamId() != null)existingProject.setProjectteamId(project.getProjectteamId());
						return projectRepository.save(existingProject);
					})
					.map(updatedProject -> new ResponseEntity<>(updatedProject, HttpStatus.OK))
					.defaultIfEmpty(new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}
	
}
