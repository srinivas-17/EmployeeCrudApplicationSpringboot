package com.emloyee.Incident.Incident.service;


import com.emloyee.Incident.Incident.Model.User;
import com.emloyee.Incident.Incident.Repositroy.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAll(){
        return userRepository.findAll();
    }

    public User addStudent(User st){
        return userRepository.save(st);
    }

    public void updateStudentBasedOnId(String id,User user){
        User st=userRepository.findById(id).get();
        st.setUsername(st.getUsername());
        userRepository.save(st);

    }
    public void deleteEmployee(String id){
        userRepository.deleteById(id);
    }

    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

}
