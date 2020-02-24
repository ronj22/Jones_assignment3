import java.security.SecureRandom;
import java.util.Scanner;

public class CAI1 {
	public int num1;
	public int num2;
	public int answer;
	public int product;
	
	SecureRandom rand = new SecureRandom();
	Scanner scan = new Scanner(System.in);
	
	
	public int quiz()
	{
		this.num1 = rand.nextInt(10);
		this.num2 = rand.nextInt(10);
		
		this.product = num1 * num2;
		return product;
	}
	
	public void askQuestion()
	{
		
		System.out.printf("What is the Product of %d and %d\n",num1,num2);
		this.answer = scan.nextInt();
	
	}
	
	public void isAnswerCorrect()
	{
		if(this.answer == this.product)
		{
			this.displayCorrectResponse();
		}
		while (this.answer != this.product) 
		{
			this.displayIncorrectResponse();
			askQuestion();
		}
	}
	
	public void displayCorrectResponse()
	{
			System.out.println("Very Good!");
		
	}
	
	public void displayIncorrectResponse()
	{
		
			System.out.println("No. Please try again.");
			
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CAI1 pp = new CAI1();
		pp.quiz();
		pp.askQuestion();
		pp.isAnswerCorrect();
		

		
	}

}
