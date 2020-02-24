import java.security.SecureRandom;
import java.util.Scanner;
import java.lang.Math;

public class CAI5 {

	SecureRandom rand = new SecureRandom();
	Scanner scan = new Scanner(System.in);
	
	
	public int num1;
	public int num2;
	public double answer;
	
	public int product;
	public int choice; 
	public int count;
	public double numCorrect;
	public double numIncorrect;
	public double score;
	public int restart;
	public int difficulty;
	public int problemType;
	public int add;
	public int subtract;
	public double divide;
	public int mix;
	public int control;
	public double dPlace = 0.001;
	
	
	
	
	public void quiz()
	{
		this.count = 0;
		this.numCorrect = 0;
		this.numIncorrect = 0;
		
		System.out.println("What difficulty level do you want 1-2-3-4");
		readDifficulty();
		
		System.out.println("What problem type would you want 1:Addition - 2:Multiplication - 3:Subtraction - 4:Divide - 5:Mixture");
		readProblemType();
		
		while (count <10)
		{
		generateQuestionArgument();
		
		this.product = num1 * num2;
		this.add = num1 + num2;
		this.subtract = num1 - num2;
		this.divide = num1 / num2;
		
		
		
	
		askQuestion();
		readResponse();
		
		if (isAnswerCorrect() == 0)
			{
				displayIncorrectResponse();
				this.numIncorrect++;
				
			}
		else
		{
			this.numCorrect++;
		}
		this.count++;	
		}
		
		
		System.out.printf("Number of correct answer: %.0f\n",this.numCorrect);
		System.out.printf("Number of incorrect answers: %.0f\n",this.numIncorrect);
		
		
		
		percentage();
		displayCompletionMessage();
		restart();
		
		
	}
	
	public void readProblemType()
	{
		this.problemType = scan.nextInt();
	}
	
	
	
	public void readDifficulty()
	{
		this.difficulty = scan.nextInt();
	}
	
	
	
	public void generateQuestionArgument()
	{
		if(this.difficulty == 1)
		{
			this.num1 = rand.nextInt(9)+1;
			this.num2 = rand.nextInt(9)+1;
		}
		else if(this.difficulty == 2)
		{
			this.num1 = rand.nextInt(99)+1;
			this.num2 = rand.nextInt(99)+1;
		}
		else if(this.difficulty == 3)
		{
			this.num1 = rand.nextInt(999)+1;
			this.num2 = rand.nextInt(999)+1;
		}
		else if(this.difficulty == 4)
		{
			this.num1 = rand.nextInt(9999)+1;
			this.num2 = rand.nextInt(9999)+1;
		}
	}
	
	
	
	
	public void askQuestion()
	{
		if (this.problemType == 2) {
			multiply();
		}
		else if(this.problemType == 1)
		{
			add();
		}
		else if(this.problemType == 3)
		{
			subtract();
		}
		else if(this.problemType == 4)
		{
			divide();
			
		}
		else if(this.problemType == 5)
		{
			mix();
			
		}
		
		
	}
	
	public void add()
	{
		System.out.printf("What is  %d + %d\n",num1,num2);
	}
	
	public void subtract()
	{
		System.out.printf("What is %d - %d\n",num1,num2);
	}
	
	public void divide()
	{
		System.out.printf("What is  %d / %d to 2 decimal places \n",num1,num2);
	}
	
	public void multiply()
	{
		System.out.printf("What is the Product of %d and %d\n",num1,num2);
	}
	
	public void mix()
	{
		this.control = rand.nextInt(4);
		switch(this.control) {
		case 0:
			add();
			break;
		case 1:	
			subtract();
			break;
		case 2:
			multiply();
			break;
		case 3:
			divide();
			break;
		}
	}
	
	
	public void readResponse()
	{
		this.answer = scan.nextDouble();
		
	}
	
	
	
	public int isAnswerCorrect()
	{
		if(this.answer == this.product)
		{
			this.displayCorrectResponse();
			return 1;
		}
		else if(this.answer == this.add)
		{
			this.displayCorrectResponse();
			return 1;
		}
		else if(this.answer == this.subtract)
		{
			this.displayCorrectResponse();
			return 1;
		}
		else if(this.answer == this.divide)
			//if (Math.abs(this.answer - this.divide) < this.dPlace)
		{
			this.displayCorrectResponse();
			return 1;
		}
		else if(this.answer == this.divide || this.answer == this.add || this.answer == this.subtract || this.answer == this.product)
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
	
	
	public void percentage()
	{
		
		this.score = (this.numCorrect / 10)*100;
		
		System.out.printf("score:%.0f\n",this.score);
		
		
	}
	
	
	
	public void displayCompletionMessage()
	{
		
		if (this.score >= 75)
		{
			System.out.println("Congratulations, you are ready to go to the next level!\n");
		}
		else
		{
			System.out.println("Please ask your teacher for extra help\n");
		}
	}
	
	
	public void restart()
	{
		System.out.println("If you would like to solve another problem set enter 1\n");
		this.restart = scan.nextInt();
		
		if(this.restart == 1)
		{
			quiz();
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CAI5 pp = new CAI5();
		pp.quiz();
		
		
		
		
		
	}

}
