package com.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.customer.entity.Logindetails;

/**
 * Code Repository Interface:
 * create the LoginRepository interface that extends the JpaRepository interface defined by Spring Data JPA.
 * 
 * this is almost the code we need for the data access layer. 
 * As with Spring Data JPA, you don't have to write any DAO code. 
 * Just declare an interface that extends the JpaRepository interface, which defines CRUD methods like save(), findAll(), findById(), deleteById(), etc. 
 * At runtime, Spring Data JPA automatically generates the implementation code.
 * Note that we must specify the type of the model class and type of the primary key field when extending the JpaRepository interface: 
 * JpaRepository<Logindetails, Long>
 */

@Repository("loginRepository")
public interface LoginRepository extends JpaRepository<Logindetails, Long> {
	
	@Query(value = "SELECT c FROM Logindetails c WHERE c.username = :username"
			+ " AND c.userpassword = :userpassword")
	public Logindetails validateUser(@Param("username") String username, @Param("userpassword") String userpassword);
}