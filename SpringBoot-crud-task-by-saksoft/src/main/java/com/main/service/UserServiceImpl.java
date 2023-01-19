package com.main.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.main.entity.User;
import com.main.repository.UserRepo;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepo repo;

	@Override
	public User saveUser(User user) {		
		return repo.save(user);
	}

	@Override
	public List<User> fetchAllUser() {
		return repo.findAll();
	}
	@Override
	public User update(int id) {	
		return repo.save(id);
	}

	@Override
	public String deleteUser(int id) {
		repo.deleteById(id);
		return "record deleted";		
	}

	@Override
	public Optional<User> findById(int id) {
		
		return repo.findById(id);
	}

}
