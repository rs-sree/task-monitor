package com.taskmonitor.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.taskmonitor.model.entity.Employee;

@Repository
public interface EmployeeRespository extends ReactiveMongoRepository<Employee, String> {

}
