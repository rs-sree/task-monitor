/**
 * 
 */
package com.taskmonitor.service.impl;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.taskmonitor.model.entity.Employee;
import com.taskmonitor.repository.EmployeeRespository;
import com.taskmonitor.service.interfaces.IEmployeeService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author sree
 *
 */
@Service
public class EmployeeService implements IEmployeeService {

	@Autowired
	EmployeeRespository employeeRepository;
	
	@Override
	public Mono<Employee> addEmployee(@Valid Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public Flux<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Mono<ResponseEntity<Employee>> updateEmployee(String employeeId, @Valid Employee employee) {
		return employeeRepository.findById(employeeId)
			   .flatMap(existingEmployee -> {
				  if(employee.getEmployeeDescription()!=null)existingEmployee.setEmployeeDescription(employee.getEmployeeDescription());
				  if(employee.getEmployeeEmail()!=null)existingEmployee.setEmployeeEmail(employee.getEmployeeEmail());
				  if(employee.getEmployeeName()!=null)existingEmployee.setEmployeeName(employee.getEmployeeName());
				  if(employee.getEmployeePassword()!=null)existingEmployee.setEmployeePassword(employee.getEmployeePassword());
				  if(employee.getEmployeeRole()!=null)existingEmployee.setEmployeeRole(employee.getEmployeeRole());
				  if(employee.getEmployeeTeamId()!=null)existingEmployee.setEmployeeTeamId(employee.getEmployeeTeamId());
				  if(employee.getEmployeeProjectId()!=null)existingEmployee.setEmployeeProjectId(employee.getEmployeeProjectId());
				  return employeeRepository.save(existingEmployee); 
			   })
			   .map(updatedEmployee -> new ResponseEntity<>(updatedEmployee,HttpStatus.OK))
			   .defaultIfEmpty(new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}
	
}
