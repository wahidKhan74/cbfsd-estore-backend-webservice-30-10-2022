package com.simplilearn.estore.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.estore.admin.entity.Users;

public interface UsersRepository extends JpaRepository<Users, Integer>{
	
}
