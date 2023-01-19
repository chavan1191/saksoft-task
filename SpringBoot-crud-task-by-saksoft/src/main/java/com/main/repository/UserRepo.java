package com.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.main.entity.User;
@Repository
public interface UserRepo extends JpaRepository<User, Integer>{

	public User save(int id);

}
