package com.emloyee.Incident.Incident.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emloyee.Incident.Incident.Model.Incident;
import com.emloyee.Incident.Incident.Repositroy.IncidentRepository;

@Service
public class IncidentService {
    @Autowired
    private IncidentRepository incidentRepository;

    public Incident createIncident(Incident incident) {

        return incidentRepository.save(incident);
    }
    
    public List<Incident> getAllIncidents(){
    	return incidentRepository.findAll();
    }
}
