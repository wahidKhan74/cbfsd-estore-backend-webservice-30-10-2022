package com.simplilearn.estore.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.estore.admin.entity.Admins;

public interface AdminsRepository extends JpaRepository<Admins, Integer> {

}
