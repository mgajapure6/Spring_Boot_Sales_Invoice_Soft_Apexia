package com.apexia.common.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.apexia.common.beans.UserMaster;;

@Repository
public interface UserRepository extends CrudRepository<UserMaster, Integer>  {
	
	public UserMaster findByUsernameAndPassword(String username, String password);
	

}
