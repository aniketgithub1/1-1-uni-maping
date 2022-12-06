package com.jsp.person.pan;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pan {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int panId;
    private long panNumber;
    
    public int getPanId() {
	return panId;
}
public void setPanId(int panId) {
	this.panId = panId;
}
public long getPanNumber() {
	return panNumber;
}
public void setPanNumber(long panNumber) {
	this.panNumber = panNumber;
}
	
}
