package com.main.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="USER")
public class User {

	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	@Column(name="Id")
	private int id;
	@Column(name="First Name")
	private String firstName;
	@Column(name="Last Name")
	private String lastName;
	@Column(name="Email")
	private String email;
	@Column(name="Age")
	private int age;
	
}
