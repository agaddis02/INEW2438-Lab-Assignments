package application;

import java.util.Date;

public class Loan {

	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private java.util.Date loanDate;
	
	//Default Constructor
	public Loan() {
		this(2.5,1,1000);
	}

	public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
		this.annualInterestRate = annualInterestRate;
		this.numberOfYears = numberOfYears;
		this.loanAmount = loanAmount;
		loanDate = new java.util.Date();
	}
	
	//get monthly payment
	public double getMonthlyPayment() {
		double monthlyInterestRate = annualInterestRate / 1200;
		double monthlyPayment = loanAmount * monthlyInterestRate / (1-(1/Math.pow(1+monthlyInterestRate, numberOfYears)));
		return monthlyPayment;
	}
	
	public double getTotalPayment() {
		double totalPayment = getMonthlyPayment() * numberOfYears *12;
		return totalPayment;
	}



}
