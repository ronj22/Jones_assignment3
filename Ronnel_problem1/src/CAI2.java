import java.security.SecureRandom;
import java.util.Scanner;

public class CAI2 {
	SecureRandom rand = new SecureRandom();
	Scanner scan = new Scanner(System.in);
	
	
	public int num1;
	public int num2;
	public int answer;
	public int product;
	public int choice; 
	
	
	
	public void quiz()
	{
		this.num1 = rand.nextInt(10);
		this.num2 = rand.nextInt(10);
		
		this.product = num1 * num2;
		
		askQuestion();
		readResponse();
	
	while(true) {	
		if (isAnswerCorrect() == 0)
		{
			displayIncorrectResponse();
			askQuestion();
			readResponse();
			
		}
		else
		{
			break;
		}
	}
			
	}
	
	public void askQuestion()
	{
		
		System.out.printf("What is the Product of %d and %d\n",num1,num2);
		
		
	}
	
	public void readResponse()
	{
		this.answer = scan.nextInt();
	}
	
	public int isAnswerCorrect()
	{
		if(this.answer == this.product)
		{
			this.displayCorrectResponse();
			return 1;
		}
		return 0;
	}
	
	public void displayCorrectResponse()
	{
		this.choice = rand.nextInt(4);
		switch(this.choice) {
		case 0:
			System.out.println("Very Good!");
			break;
		case 1:	
			System.out.println("Excellent!");
			break;
		case 2:
			System.out.println("Nice Work!");
			break;
		case 3:
			System.out.println("Keep up the good work!");
			break;
		}
	}
	
	public void displayIncorrectResponse()
	{
		this.choice = rand.nextInt(4);
		
		switch(this.choice) {
		case 0:
			System.out.println("No please try again.");
			break;
		case 1:	
			System.out.println("Wrong. Try once more.");
			break;
		case 2:
			System.out.println("Don't give up!");
			break;
		case 3:
			System.out.println("No. Keep trying.");
			break;
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CAI2 pp = new CAI2();
		pp.quiz();
		
		
		
	}

}
