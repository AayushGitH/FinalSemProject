package com.pro.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.pro.api.entities.User;

public interface UserRepository extends JpaRepository<User, String> 
{
	@Query("select u from User u where u.Name=:Name")
	User findByName(@Param("Name") String Name);
	
}
