import java.security.SecureRandom;
import java.util.Scanner;

public class CAI4 {

	SecureRandom rand = new SecureRandom();
	Scanner scan = new Scanner(System.in);
	
	
	public int num1;
	public int num2;
	public int answer;
	public int product;
	public int choice; 
	public int count;
	public double numCorrect;
	public double numIncorrect;
	public double score;
	public int restart;
	public int difficulty;
	
	
	
	
	public void quiz()
	{
		this.count = 0;
		this.numCorrect = 0;
		this.numIncorrect = 0;
		
		System.out.println("What difficulty level do you want 1-2-3-4");
		readDifficulty();
		
		
		while (count <10)
		{
		generateQuestionArgument();
		
		this.product = num1 * num2;
		
		
	
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
	
	
	public void readDifficulty()
	{
		//System.out.println("What difficulty level do you want 1-2-3-4\n");
		this.difficulty = scan.nextInt();
	}
	
	
	
	public void generateQuestionArgument()
	{
		if(this.difficulty == 1)
		{
			this.num1 = rand.nextInt(10);
			this.num2 = rand.nextInt(10);
		}
		else if(this.difficulty == 2)
		{
			this.num1 = rand.nextInt(100);
			this.num2 = rand.nextInt(100);
		}
		else if(this.difficulty == 3)
		{
			this.num1 = rand.nextInt(1000);
			this.num2 = rand.nextInt(1000);
		}
		else if(this.difficulty == 4)
		{
			this.num1 = rand.nextInt(10000);
			this.num2 = rand.nextInt(10000);
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
		
		CAI4 pp = new CAI4();
		pp.quiz();
		
		
		
		
		
	}

}
