/**
 * 
 */
package com.taskmonitor.model.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author sree
 *
 */
@Document(collection = "projects")
public class Project {
	
	@Id
	private String projectId;
	private String projectName;
	private String projectStartDate;
	private String projectEndDate;
	private String projectStatus;
	private String projectteamId;
	/**
	 * @return the projectId
	 */
	public String getProjectId() {
		return projectId;
	}
	/**
	 * @param projectId the projectId to set
	 */
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	/**
	 * @return the projectName
	 */
	public String getProjectName() {
		return projectName;
	}
	/**
	 * @param projectName the projectName to set
	 */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	/**
	 * @return the projectStartDate
	 */
	public String getProjectStartDate() {
		return projectStartDate;
	}
	/**
	 * @param projectStartDate the projectStartDate to set
	 */
	public void setProjectStartDate(String projectStartDate) {
		this.projectStartDate = projectStartDate;
	}
	/**
	 * @return the projectEndDate
	 */
	public String getProjectEndDate() {
		return projectEndDate;
	}
	/**
	 * @param projectEndDate the projectEndDate to set
	 */
	public void setProjectEndDate(String projectEndDate) {
		this.projectEndDate = projectEndDate;
	}
	/**
	 * @return the projectStatus
	 */
	public String getProjectStatus() {
		return projectStatus;
	}
	/**
	 * @param projectStatus the projectStatus to set
	 */
	public void setProjectStatus(String projectStatus) {
		this.projectStatus = projectStatus;
	}
	/**
	 * @return the projectteamId
	 */
	public String getProjectteamId() {
		return projectteamId;
	}
	/**
	 * @param projectteamId the projectteamId to set
	 */
	public void setProjectteamId(String projectteamId) {
		this.projectteamId = projectteamId;
	}

	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectName=" + projectName + ", projectStartDate="
				+ projectStartDate + ", projectEndDate=" + projectEndDate + ", projectStatus=" + projectStatus + ", projectteamId=\" + projectteamId + \"]";
	}
	
}