package Games;
import java.util.Random;
import java.util.Scanner;
public class War2 {
	static Scanner input = new Scanner (System.in);
	public static void main(String[] args) 
	{

		Random rand = new Random();

		int  player1 = rand.nextInt(50) + 1;
		int  player2 = rand.nextInt(50) + 1;
		int player1score = 0;
		int player2score = 0;
		int choice;
		
		
		System.out.println("Player1's number is: " + player1);
		System.out.println("Player2's number is: " + player2);
		
		if(player1 > player2)
		{
			player1score ++;
			System.out.println("Player1's score is now: " + player1score);
			
				
		}
		if(player2 > player1)
		{
			player2score ++;
			System.out.println("Player2's score is now: " + player2score);
			
			
		}System.out.println("Would you like to play again? '1' for Yes, '2' for No");
		choice = input.nextInt();
		
		while(choice == 1)
		{
			
		}
		
	}
}