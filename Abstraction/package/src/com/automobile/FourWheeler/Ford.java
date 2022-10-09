package com.automobile.FourWheeler;

import com.automobile.Vehicle;

public class Ford {
	private String modelName;
	private String registrationNumber;
	private String ownerName;
	private int speed;
	private int tempControl;

	public Ford(String modelName, String registrationNumber, String ownerName, int speed, int tempControl) {
		super();
		this.modelName = modelName;
		this.registrationNumber = registrationNumber;
		this.ownerName = ownerName;
		this.speed = speed;
		this.tempControl = tempControl;
	}

	public void getModelName()
	{
		System.out.println("modelName: " + modelName);
	}

	public void getRegistrationNumber()
	{
		System.out.println("registrationNumber: " + registrationNumber);
	}

	public void getOwnerName()
	{
		System.out.println("ownerName: " + ownerName);
	}
	
	public int speed()
	{
		return speed;
	}
	
	public int tempControl()
	{
		return tempControl;
	}

}