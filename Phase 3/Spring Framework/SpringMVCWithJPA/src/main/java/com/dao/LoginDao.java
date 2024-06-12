package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.Login;

@Repository
public class LoginDao {
	
	@Autowired
	EntityManagerFactory emf; // it gets di from dispatcher-servlet.xml using
	// LocalContainerEntityManagerFactoryBean
	
	public int signIn(Login login) {
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery("select ll from Login ll where ll.emailid = : emaildid and ll.password= :password");
		qry.setParameter("emailid", login.getEmailid());
		qry.setParameter("password", login.getPassword());
		List<Login> listOfInfo = qry.getResultList();
		return listOfInfo.size();
	}
	
	public int signUp(Login login) {
		try {
			EntityManager manager = emf.createEntityManager();
			EntityTransaction tran = manager.getTransaction();
			tran.begin();
			manager.persist(login);
			tran.commit();
			return 1;
		}
		
		catch (Exception e) {
		
			System.err.println(e);
			return 0;
		}
	}

}
