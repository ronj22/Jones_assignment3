
public class SavingsAccount {
	
	public static double annualInterestRate = 0.04;
	private double savingBalance;
	private double monthlyInterest;
	
	
	public SavingsAccount(double B) {
		// TODO Auto-generated constructor stub
		this.savingBalance = B;
		//annualInterestRate = 0;
	}
	
	public double calculateMonthlyInterest()
	{
		this.monthlyInterest = this.savingBalance * annualInterestRate/(12);
		this.savingBalance = this.savingBalance + this.monthlyInterest;
		return this.savingBalance;
	}
	
	
	 static double modifyInterestRate(double newValue)
	{
		annualInterestRate = newValue;
		return annualInterestRate;
	}
	
/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
*/
}
