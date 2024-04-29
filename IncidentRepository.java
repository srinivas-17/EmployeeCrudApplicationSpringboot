package com.emloyee.Incident.Incident.Repositroy;

import com.emloyee.Incident.Incident.Model.Incident;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IncidentRepository extends MongoRepository<Incident,String> {
}
