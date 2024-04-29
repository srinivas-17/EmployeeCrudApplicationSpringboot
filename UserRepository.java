package com.emloyee.Incident.Incident.Repositroy;

import com.emloyee.Incident.Incident.Model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String> {

    User findByUsername(String username);

}
