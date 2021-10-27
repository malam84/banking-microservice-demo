package com.banking.user.login.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.banking.user.login.model.User;

@Repository
@Transactional
public interface LoginRepository extends JpaRepository<User, Long> {
	
	@Query("SELECT CASE WHEN count(e) > 0 THEN true ELSE false END FROM User e where e.userName = :username")
	public boolean chkUserExist(@Param("username") String usrName);
	
	@Query("SELECT a from User a WHERE a.userName = :username")
	User fetchUserByUserName(@Param("username") String usrName);

}
