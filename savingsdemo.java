package oopsassignment;

public class savingsdemo {

	
	
	public static void main(String[] args) {
		savingsaccount savingsaccount=new savingsaccount(5000,2);
		savingsaccount.getBalance();
		System.out.println("Acccount Balance is "+savingsaccount.getBalance());
		savingsaccount.getInterest();
		System.out.println("Acccount Balance is "+savingsaccount.getInterest()+"%");
		savingsaccount.withdraw();
		System.out.println("Balance after withdrawing is "+savingsaccount.getBalance());
		savingsaccount.deposit();
		System.out.println("Balance on depositing "+savingsaccount.getBalance());
		
		
	

}
}