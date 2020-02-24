import java.util.Formatter;

public class SavingsAccountTest {
	/*
	public static double annualInterestRate = 0.04;
	private double savingBalance;
	private double monthlyInterest;
	private double monthlyInterest2;
	private static double newValue = 0.05;
	*/
	public int month = 0;
	
	SavingsAccount saver1 = new SavingsAccount(2000.00);
	SavingsAccount saver2 = new SavingsAccount(3000.00);
	
	

	public void fourPercent()
	{
		int i;
		
		System.out.printf("Month\tSaver1\t\tSaver2\n");
		for(i=0;i<12;i++)
		{
		//saver1.calculateMonthlyInterest();
		//saver2.calculateMonthlyInterest();
		
		//System.out.printf("Saver 1 Balance: $%.2f\n",saver1.calculateMonthlyInterest());
		//System.out.printf("Saver 2 Balance: $%.2f\n",saver2.calculateMonthlyInterest());
			this.month++;
		System.out.print(month+"\t");
		System.out.format("%.2f\t\t",saver1.calculateMonthlyInterest());
		System.out.format("%.2f\t",saver2.calculateMonthlyInterest());
		System.out.println();
		}
	}
	
	public void fivePercent()
	{
		SavingsAccount.modifyInterestRate(0.05);
		this.month++;
		//saver1.calculateMonthlyInterest();
		//saver2.calculateMonthlyInterest();
		
		//System.out.printf("Saver 1 Balance: $%.2f\n",saver1.calculateMonthlyInterest());
		//System.out.printf("Saver 2 Balance: $%.2f\n",saver2.calculateMonthlyInterest());
		System.out.print(month+"\t");
		System.out.format("%.2f\t\t",saver1.calculateMonthlyInterest());
		System.out.format("%.2f\t",saver2.calculateMonthlyInterest());
		System.out.println();
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccountTest pp = new SavingsAccountTest();
		pp.fourPercent();
		pp.fivePercent();
		
		
		}
	
	}


