package oopsassignment;

public class savingsaccount{
	double Balance;
	int Interest;
	
	
	public savingsaccount(double balance, int interest) {
		super();
		this.Balance = balance;
		this.Interest = interest;
	}


	public double getBalance() {
		return Balance;
	}


	
	public int getInterest() {
		return Interest;
	}
	
	void withdraw() {
		Balance=Balance-100;
	}
	void deposit() {
		Balance=Balance+100;
	}
	
	




}



