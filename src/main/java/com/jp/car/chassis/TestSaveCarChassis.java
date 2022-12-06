package com.jp.car.chassis;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveCarChassis {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("aniket");
	    EntityManager eManager = entityManagerFactory.createEntityManager();
	    EntityTransaction eTransaction= eManager.getTransaction();
	    
	    Chassis chassis = new Chassis();
	    chassis.setChassisNumber(234200000);
	    
	    Car car = new Car();
	    car.setChassis(chassis);
	    car.setName("Tata");
	    car.setNumber("MH12DE1773");
	    car.setModel("punch");
	    
	    eTransaction.begin();
	    eManager.persist(chassis);
	    eManager.persist(car);
	    eTransaction.commit();
	    
	    System.out.println("ALL GOOD");
	}

}
