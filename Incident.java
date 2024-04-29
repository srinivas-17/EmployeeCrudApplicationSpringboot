package com.emloyee.Incident.Incident.Model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;

@Document(collection = "incidents")
@Data
public class Incident {
    @Id
    private String id;

    private String incidentId;
    private String enterpriseOrGovernment;
    private String reporterName;
    private String incidentDetails;
    private LocalDateTime reportedDateTime;
    private String priority;
    private String status;
    private String category;
    
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIncidentId() {
		return incidentId;
	}

	public void setIncidentId(String incidentId) {
		this.incidentId = incidentId;
	}

	public String getEnterpriseOrGovernment() {
		return enterpriseOrGovernment;
	}

	public void setEnterpriseOrGovernment(String enterpriseOrGovernment) {
		this.enterpriseOrGovernment = enterpriseOrGovernment;
	}

	public String getReporterName() {
		return reporterName;
	}

	public void setReporterName(String reporterName) {
		this.reporterName = reporterName;
	}

	public String getIncidentDetails() {
		return incidentDetails;
	}

	public void setIncidentDetails(String incidentDetails) {
		this.incidentDetails = incidentDetails;
	}

	public LocalDateTime getReportedDateTime() {
		return reportedDateTime;
	}

	public void setReportedDateTime(LocalDateTime reportedDateTime) {
		this.reportedDateTime = reportedDateTime;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Incident [id=" + id + ", incidentId=" + incidentId + ", enterpriseOrGovernment="
				+ enterpriseOrGovernment + ", reporterName=" + reporterName + ", incidentDetails=" + incidentDetails
				+ ", reportedDateTime=" + reportedDateTime + ", priority=" + priority + ", status=" + status
				+ ", category=" + category + "]";
	}

    
}
