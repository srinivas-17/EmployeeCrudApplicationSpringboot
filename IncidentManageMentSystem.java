package com.emloyee.Incident.Incident;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication()
//@ComponentScan(basePackages = {"com.emloyee.Incident.IncidentDetails.repository"})
public class IncidentManageMentSystem {

	public static void main(String[] args) {

		SpringApplication.run(IncidentManageMentSystem.class, args);
	}
}
