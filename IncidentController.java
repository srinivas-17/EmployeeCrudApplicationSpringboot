package com.emloyee.Incident.Incident.controller;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.emloyee.Incident.Incident.Model.Incident;
import com.emloyee.Incident.Incident.service.IncidentService;


@RestController
@ResponseBody
public class IncidentController {

    @Autowired
    private IncidentService incidentService;


    @PostMapping("/create")
    public Incident createIncident(@RequestBody  Incident incident) {

    	 String str="RMG";
         Random rand = new Random();
    
         int randomInteger = rand.nextInt(100000);
         
         str=str+randomInteger+"2024";

       // System.out.println("Random Integers: "+str+2024);
         incident.setIncidentId(str);
         
    	System.out.println(incident);
        return incidentService.createIncident(incident);
    }
    
    @GetMapping("/allIncidents")
    public List<Incident> getAllIncidents(){
    	return incidentService.getAllIncidents();
    }
}
