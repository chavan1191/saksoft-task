package com.main.service;

import java.util.List;
import java.util.Optional;
import com.main.entity.User;

public interface UserService {

	
	public User saveUser(User user);
	
	public List<User> fetchAllUser();
	
	public User update(int id);
	
	public String deleteUser(int id);
	
	public Optional<User> findById(int id);
	
	
}
