package com.hibernate.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bike {

	@Id
	int registrationNumber;
	String model;
	double cost;

	public Bike() {
	}

	public Bike(int registrationNumber, String model, double cost) {
		this.registrationNumber = registrationNumber;
		this.model = model;
		this.cost = cost;
	}

	public int getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(int registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Bike [registrationNumber=" + registrationNumber + ", model=" + model + ", cost=" + cost + "]";
	}

}
