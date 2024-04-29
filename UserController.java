package com.emloyee.Incident.Incident.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.emloyee.Incident.Incident.Model.User;
import com.emloyee.Incident.Incident.service.UserService;

@RestController
@ResponseBody
public class UserController {
	@Autowired
	private UserService userService;

	
	@GetMapping("/allStudents")
	public List<User> getAll(){
		List<User> all =userService.getAll();
		System.out.println(all.stream().count());
		return all;
	}


	@PostMapping("update/{id}")
	public String updateUser(@PathVariable String id,@RequestBody User st){
		userService.updateStudentBasedOnId(id,st);
		return "records updated successfully";
	}
	@DeleteMapping("/delete/{id}")
	public String deleteStudentById(@PathVariable String id){
		userService.deleteEmployee(id);
		return "Student record deleted successfuly";
	}


    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestParam String username, @RequestParam String password) {
        User user = userService.findByUsername(username);
        if (user != null && user.getPassword().equals(password)) {
            return ResponseEntity.ok("Login successful");
        } else {
            return ResponseEntity.badRequest().body("Invalid username or password");
        }
    }

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody User user) {
        User existingUser = userService.findByUsername(user.getUsername());
        if (existingUser != null) {
            return ResponseEntity.badRequest().body("Username already exists");
        }
        userService.addStudent(existingUser);
        return ResponseEntity.ok("Registration successful");
    }
}
	


