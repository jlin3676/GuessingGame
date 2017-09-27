import java.util.InputMismatchException;
import java.lang.Math;
import java.util.Scanner;
public class GuessingGame {
// Jacky Lin
	public static void main(String[]args)
	{	
		Scanner input = new Scanner(System.in);
		System.out.println("What is your name?");
		String s = input.next();
		System.out.println("Nice to meet you, " + s + ". " + "How old are you?");
		int x = input.nextInt();
		System.out.println("That's great! But let's try guessing what my age is!");
		int age = (int)(Math.random() * 10 + 1);
		System.out.println(age);
		int guess = -1;
		int count = 0;
		while(guess != age)
		{
			try
			{
				System.out.println("What is my age?");
				guess = input.nextInt();
				{
					if(guess == age)
					{
						System.out.println("Yes, that is my age. It took you " + count + " tries");
					}
					else
					{
						System.out.println("No, that is not my age, try again.");
					}
				}
			}
			catch(InputMismatchException e)
			{
				System.out.println("No, that is not a number. Please try again.");
				input.nextLine();
			}	
		}
		
	}
}
