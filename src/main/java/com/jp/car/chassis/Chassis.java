package com.jp.car.chassis;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Chassis {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int chassisId;
	private long chassisNumber;
	
	public int getChassisId() {
		return chassisId;
	}
	public void setChassisId(int chassisId) {
		this.chassisId = chassisId;
	}
	public long getChassisNumber() {
		return chassisNumber;
	}
	public void setChassisNumber(long chassisNumber) {
		this.chassisNumber = chassisNumber;
	}
	
	
}
