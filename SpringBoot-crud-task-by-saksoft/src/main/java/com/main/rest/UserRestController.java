package com.main.rest;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.main.entity.User;
import com.main.service.UserServiceImpl;

@RestController
public class UserRestController {
	@Autowired
	private UserServiceImpl service;
	
	
	@PostMapping("/save")
	public User saveData(@RequestBody User user) {
		User saveData = service.saveUser(user);
		return saveData;
		
	}
	@GetMapping("/fetch")
	public List<User> fetchData() {
		return service.fetchAllUser();
		
	}
	@PostMapping("/update/{id}")
	public User updateData(@PathVariable	int id ,@RequestBody User user) {
		return service.saveUser(user);	
	}
	
	@PostMapping("/delete/{id}")
	public String deleteData(@PathVariable	int id) {
		 service.deleteUser(id);
		 return "Record deleted";
		
	}
	@GetMapping("/findby/{id}")
	public Optional<User> findById(@PathVariable int id) {
		return service.findById(id);	
	}
}
