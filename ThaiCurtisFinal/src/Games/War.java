package Games;
import java.util.Random;
import java.util.Scanner;
public class War {
	static Scanner input = new Scanner (System.in);
	public static void main(String[] args) 
	{

		Random rand = new Random();

		int  player1 = rand.nextInt(50) + 1;
		int  player2 = rand.nextInt(50) + 1;
		int score1 = 0;
		int score2;
		int score3;
		int choice;
		
		
		System.out.println("Player1's number is: " + player1);
		System.out.println("Player2's number is: " + player2);
		
		if(player1 > player2)
		{
			score1 +=1;
			System.out.println("Player1's score is now: " + score1);
			
				
		}
		if(player2 > player1)
		{
			score1 +=1;
			System.out.println("Player2's score is now: " + score1);
			
			
		}System.out.println("Would you like to play again? 1 for Yes, 2 for No");
		choice = input.nextInt();
		
		if(choice == 1)
		{
			playAgain();
		}
		else
		{
			System.exit(0);
		}
	}
	
		public static void playAgain()
		{
			Random rand = new Random();

			int  player1 = rand.nextInt(50) + 1;
			int  player2 = rand.nextInt(50) + 1;
			int score1;
			int score2 = 0;
			int score3;
			int choice;
			
			
			System.out.println("Player1's number is: " + player1);
			System.out.println("Player2's number is: " + player2);
			
			if(player1 > player2)
			{
				score2+=1;
				System.out.println("Player1's score is now: "+ score2);
				
				
					
			} 
			if(player2 > player1)
			{
				score2+=1;
				System.out.println("Player2's score is now: " + score2);
			}
			System.out.println("Would you like to play again? 1 for Yes, 2 for No");
			choice = input.nextInt();
			
			if(choice == 1)
			{
				playAgain();
			}
			else
			{
				System.exit(0);
			}
		}
				
				
				public static void playAgain2()
				{
					Random rand = new Random();

					int  player1 = rand.nextInt(50) + 1;
					int  player2 = rand.nextInt(50) + 1;
					int score1 = 1;
					int score2 = 2;
					int score3 = 0;
					int choice;
					Scanner input = new Scanner (System.in);
					
					System.out.println("Player1's number is: " + player1);
					System.out.println("Player2's number is: " + player2);
					
					if(player1 > player2)
					{
						score3 +=1;
						System.out.println("Player1's score is now: " + score1 + score3);
						
							
					} 
					if(player2 > player1)
					{
						score3 +=1;
						System.out.println("Player2's score is now: " + score1 + score3 );
						
						System.out.println("Would you like to play again? 1 for Yes, 2 for No");
						choice = input.nextInt();
						
					if(choice == 1)
					{
						playAgain();
					}
					else
					{
						System.exit(0);
					}
					
					
		

		
		
//		while(choice == 1)
//		{
//			System.out.println("Player1's number is: " + player1);
//			System.out.println("Player2's number is: " + player2);
//			break;
//		}
//		while(choice != 1)
		{
//			System.out.println("You have exited the program");
//			break;
		}
}
		}
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

	


