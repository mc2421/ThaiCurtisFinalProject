package Games;
import java.util.Random;
import java.util.Scanner;
public class War {

	public static void main(String[] args) 
	{

		Random rand = new Random();

		int  player1 = rand.nextInt(50) + 1;
		int  player2 = rand.nextInt(50) + 1;
		int score = 0;
		int choice;
		Scanner input = new Scanner (System.in);
		
		
		
		System.out.println("Player1's number is: " + player1);
		System.out.println("Player2's number is: " + player2);
		
		if(player1 > player2)
		{
			score ++;
			System.out.println("Player1's score is now: " + score);
			
				
		}
		if(player2 > player1)
		{
			score ++;
			System.out.println("Player2's score is now: " + score);
			
			
		}
		
		System.out.println("Would you like to play again? 1 for Yes, 2 for No");
		choice = input.nextInt();
		
		while(choice == 1)
		{
			System.out.println("Player1's number is: " + player1);
			System.out.println("Player2's number is: " + player2);
			break;
		}
		while(choice != 1)
		{
			System.out.println("You have exited the program");
			break;
		}
		
//		else
//		{
//			System.out.println("You answered no");
//			System.exit(0);
//		}
		
		
//	}
//	public static void Player2()
//	{
//		
//		Random rand = new Random();
//
//		int  player2 = rand.nextInt(50) + 1;
//		
//		System.out.println("Player2's number is " + player2);
//	
//		
//		if(player1 > player2)
//		
//		

	}

}
