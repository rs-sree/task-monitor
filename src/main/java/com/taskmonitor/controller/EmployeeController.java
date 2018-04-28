/**
 * 
 */
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
import com.taskmonitor.model.entity.Employee;
import com.taskmonitor.service.interfaces.IEmailService;
import com.taskmonitor.service.interfaces.IEmployeeService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author sree
 *
 */
@RestController
public class EmployeeController {

	@Autowired
	IEmployeeService employeeService;
	
	@Autowired
	IEmailService emailService;
	
	@PostMapping("/employees")
    public Mono<Employee> addEmployee(@Valid @RequestBody Employee employee) {
		Mono<Employee> response = employeeService.addEmployee(employee);
		if(response!=null) {
			emailService.sendSimpleMessage(employee.getEmployeeEmail(), "Sign Up", "You Have Been Registered");
		}
        return response;
    }
	
	@GetMapping("/employees")
    public Flux<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }
	
	@PatchMapping("/employees/{employeeId}/update")
    public Mono<ResponseEntity<Employee>> updateProject(@PathVariable(value = "employeeId") String employeeId, 
    		@Valid @RequestBody Employee employee) {
		Mono<ResponseEntity<Employee>> response = employeeService.updateEmployee(employeeId, employee);
		if(response!=null) {
			emailService.sendSimpleMessage(employee.getEmployeeEmail(), "Updated Successfully", "Your Data Have Been Updated");
		}
		return response;
    }
}
