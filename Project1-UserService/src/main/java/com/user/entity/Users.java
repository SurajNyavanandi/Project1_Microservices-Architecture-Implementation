package com.user.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long userId;
    public String firstName;
    public String lastName;
    public String email;
    public long departmentId;

}
