import java.util.InputMismatchException;
import java.util.Scanner;
public class GuessingGame {

	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("What is your name?");
		String s = input.next();
		System.out.println("Nice to meet you, " + s + ". " + "How old are you?");
		int x = input.nextInt();
		System.out.println("That's great! But let's try guessing what my age is!");
		int age = (int)(Math.random() * 10 + 1);
		int guess = input.nextInt();
		while(guess != age)
		{
			boolean isNumber = false;
			while(!isNumber)
			{
				try
				{
					System.out.println("What is my age?");
					isNumber = true;
				}
				catch(InputMismatchException e)
				{
					System.out.println("This was an error" + e);
				}
			}
			if(isNumber == true)
			{
				System.out.println("Yes, my age is" + " " + age);
			}
		}
		
	}
}
