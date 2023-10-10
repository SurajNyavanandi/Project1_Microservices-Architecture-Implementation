package com.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.user.entity.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Long>{

	Users findByUserId(long userId);
	
}
