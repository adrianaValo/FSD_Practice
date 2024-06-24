package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.entity.Account;import jakarta.ws.rs.Path;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer>{

	@Query("select acc.amount from Account acc where acc.emailid = :emailid")
	public float findBalance(@Param("emailid") String emailid);
	
	@Query("select acc.accno from Account acc where acc.emailid = :emailid")
	public int findAccnumber(@Param("emailid") String emailid);
}