package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.login;

@Repository
public interface LoginRepository extends CrudRepository<login,Long>{
	
	@Query("SELECT a FROM login a WHERE a.username=:username")
	 List<login> findByname(@Param("username") String username);
		
	
}
