/**
 * 
 */
package com.taskmonitor.service.interfaces;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;

import com.taskmonitor.model.entity.Employee;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author sree
 *
 */
public interface IEmployeeService {

	/****
	 * 
	 * @param employee
	 * @return
	 */
	Mono<Employee> addEmployee(@Valid Employee employee);

	/**
	 * 
	 * @return
	 */
	Flux<Employee> getAllEmployees();

	/**
	 * 
	 * @param employeeId
	 * @param employee
	 * @return
	 */
	Mono<ResponseEntity<Employee>> updateEmployee(String employeeId, @Valid Employee employee);

}
