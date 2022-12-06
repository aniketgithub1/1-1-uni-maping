package com.jsp.person.pan;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSavePersonPan {

	public static void main(String[] args) {

		EntityManagerFactory emEntityManagerFactory=Persistence.createEntityManagerFactory("aniket");
		EntityManager enManager=emEntityManagerFactory.createEntityManager();
		EntityTransaction eTransaction=enManager.getTransaction();
		
		Pan pan =new Pan();
		pan.setPanNumber(777756789);
		
		Person person=new Person();
		person.setName("sky");
		person.setDOB("1-11-1999");
		person.setPan(pan);
		
	    eTransaction.begin();
	    enManager.persist(person);
	    enManager.persist(pan);
	    eTransaction.commit();
		
	    System.out.println("ALL GOOD");
	}

}
