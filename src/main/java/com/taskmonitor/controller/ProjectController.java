package com.taskmonitor.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.taskmonitor.model.entity.Project;
import com.taskmonitor.service.interfaces.IProjectService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author sree
 *
 */
@RestController
public class ProjectController {

	@Autowired
	IProjectService projectService;
	
	@PostMapping("/projects")
    public Mono<Project> createProjects(@Valid @RequestBody Project project) {
        return projectService.createProject(project);
    }
	
	@GetMapping("/projects")
    public Flux<Project> getAllProjects() {
        return projectService.getAllProjects();
    }
	
	@PatchMapping("/projects/{projectId}/update")
    public Mono<ResponseEntity<Project>> updateProject(@PathVariable(value = "projectId") String projectId, 
    		@Valid @RequestBody Project project) {
        return projectService.updateProject(projectId, project);
    }
}
