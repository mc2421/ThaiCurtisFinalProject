package Games;
import java.util.Random;
import java.util.Scanner;
public class CompleteWarGame {
	static Scanner input = new Scanner (System.in);
	public static void main(String[] args) 
	{

		
		int player1score = 0;
		int player2score = 0;
		int player1score2 = 0;
		int player2score2 = 0;
		int choice;
//		int ex;
//		int ex2;
		do {
			Random rand = new Random();
	
			int  player1 = rand.nextInt(50) + 1;
			int  player2 = rand.nextInt(50) + 1;
			System.out.println("Player1's number is: " + player1);
			System.out.println("Player2's number is: " + player2);
		
			if(player1 > player2)
			{
				player1score ++;
				System.out.println("Player1's score is now: " + player1score);	
				System.out.println("Player2's score is now: " + player2score);
//				while(player1score != 10)
//				{
//					ex = player1score+1;
//					System.out.println("players1's score is now: " + ex);
//					break;
//				}
			}
			
			if(player2 > player1)
			{
				player2score ++;
				System.out.println("Player1's score is now: " + player1score);
				System.out.println("Player2's score is now: " + player2score);
				
//				while(player2score != 10)
//				{
//					ex2 = player2score+1;
//					System.out.println("Player2's score is now: " + ex2);
//					break;
//				}
			}
			System.out.println("Would you like to play again? '1' for Yes, '2' for No");
			choice = input.nextInt();
		}while(choice == 1);
		
		
		while(choice == 2)
		{
			System.out.println("player1's final score is: " + player1score + " Player2's final score is: " + player2score );
			break;
		}
		
		
		
		
	}
}