/**
 * 
 */
package com.taskmonitor.model.entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author sree
 *
 */
@Document
public class Employee {
	@Id
	private String employeeId;
	private String employeeName;
	private String employeePassword;
	private String employeeEmail;
	private List<String> employeeTeamIds;
	private String employeeProjectId;
	private String employeeRole;
	private String employeeDescription;
	
	/**
	 * @return the EmployeeId
	 */
	public String getEmployeeId() {
		return employeeId;
	}
	/**
	 * @param EmployeeId the EmployeeId to set
	 */
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	/**
	 * @return the EmployeeName
	 */
	public String getEmployeeName() {
		return employeeName;
	}
	/**
	 * @param EmployeeName the EmployeeName to set
	 */
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	/**
	 * @return the EmployeePassword
	 */
	public String getEmployeePassword() {
		return employeePassword;
	}
	/**
	 * @param EmployeePassword the EmployeePassword to set
	 */
	public void setEmployeePassword(String employeePassword) {
		this.employeePassword = employeePassword;
	}
	/**
	 * @return the EmployeeEmail
	 */
	public String getEmployeeEmail() {
		return employeeEmail;
	}
	/**
	 * @param EmployeeEmail the EmployeeEmail to set
	 */
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}
	/**
	 * @return the EmployeeTeamId
	 */
	public List<String> getEmployeeTeamId() {
		return employeeTeamIds;
	}
	/**
	 * @param EmployeeTeamId the EmployeeTeamId to set
	 */
	public void setEmployeeTeamId(List<String> employeeTeamIds) {
		this.employeeTeamIds = employeeTeamIds;
	}
	/**
	 * @return the EmployeeProjectId
	 */
	public String getEmployeeProjectId() {
		return employeeProjectId;
	}
	/**
	 * @param EmployeeProjectId the EmployeeProjectId to set
	 */
	public void setEmployeeProjectId(String employeeProjectId) {
		this.employeeProjectId = employeeProjectId;
	}
	/**
	 * @return the EmployeeRole
	 */
	public String getEmployeeRole() {
		return employeeRole;
	}
	/**
	 * @param EmployeeRole the EmployeeRole to set
	 */
	public void setEmployeeRole(String EmployeeRole) {
		this.employeeRole = EmployeeRole;
	}
	/**
	 * @return the EmployeeDescription
	 */
	public String getEmployeeDescription() {
		return employeeDescription;
	}
	/**
	 * @param EmployeeDescription the EmployeeDescription to set
	 */
	public void setEmployeeDescription(String employeeDescription) {
		this.employeeDescription = employeeDescription;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeePassword="
				+ employeePassword + ", employeeEmail=" + employeeEmail + ", employeeTeamIds=" + employeeTeamIds
				+ ", employeeProjectId=" + employeeProjectId + ", employeeRole=" + employeeRole
				+ ", employeeDescription=" + employeeDescription + "]";
	}

	
}
