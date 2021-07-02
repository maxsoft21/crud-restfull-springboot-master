/**
 * 
 */
package com.lombokSwagger.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lombokSwagger.demo.model.User;

/**
 * @author Max
 *
 */
public interface UserRepository extends JpaRepository<User, String>{
	
	public User findById(int id);

}
