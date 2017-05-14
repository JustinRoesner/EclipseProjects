package com.justin.dcompany;

public class Hourly extends Employee{
	private double hoursWorked;
	private double hourlyWage;
	public Hourly(String name, int id, String department, float hoursWorked, double hourlyWage) {
		super(name, id, department);
		this.hoursWorked = hoursWorked;
		this.hourlyWage = hourlyWage;
	}

	@Override
	public double CalculatePayCheck() {
		RewardSystem rewardSystem = new RewardSystem();
		double payCheck;
		payCheck = hoursWorked * hourlyWage;
		//payCheck +=  rewardSystem.PayCheckReward(payCheck);
		return payCheck;
	}

}