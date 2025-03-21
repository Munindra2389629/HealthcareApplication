package com.cognizant.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long userId;

	@NotBlank(message = "Name is mandatory")
	@Pattern(regexp = "^[A-Za-z]+$", message = "Name should contain only alphabets")
	@Size(max = 30, message = "Name should not exceed 30 characters")
	private String name;

	@Email(message = "Email should be valid")
	@NotBlank(message = "Email is mandatory")
	private String email;

	@Pattern(regexp = "^\\d{10}$", message = "Phone number should be 10 digits")
	private long phone;

	@Enumerated(EnumType.STRING)
	@NotNull(message = "Role is mandatory")
	private Role role;
	
	public enum Role {
		DOCTOR, PATIENT
	}
}