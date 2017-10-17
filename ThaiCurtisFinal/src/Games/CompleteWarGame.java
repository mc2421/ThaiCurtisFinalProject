package Games;
import java.util.Random;
import java.util.Scanner;
public class CompleteWarGame {
	static Scanner input = new Scanner (System.in);
	public static void main(String[] args) 
	{

		// all variables used in program
		int player1score = 0;
		int player2score = 0;
		int choice;

		do {
			Random rand = new Random(); // this along with lines 20 & 21 are what make up the random integer
	
			int  player1 = rand.nextInt(26) + 1;// This controls the random integer for player 1 making sure it is less than 26 
			int  player2 = rand.nextInt(26) + 1;// This controls the random integer for player 2 making sure it is also less than 
			System.out.println("Player1's number is: " + player1);
			System.out.println("Player2's number is: " + player2);
		
			if(player1 > player2) // If player1's number is greater than player2's number
			{
				player1score ++;// add 1 to player1's score
				System.out.println("Player1's score is now: " + player1score);	//and display what each others
				System.out.println("Player2's score is now: " + player2score);	//scores are now
			
			}
			
			if(player2 > player1) //If player2's number is greater than player1's number
			{
				player2score ++;//add 1 to player2's score
				System.out.println("Player1's score is now: " + player1score);//and display what each others 
				System.out.println("Player2's score is now: " + player2score);//scores are now
		
			}
			if(player1 == player2)
			{
				System.out.println("It's a tie. No one gets a point.");
			}
			System.out.println("Would you like to play again? '1' for Yes, '2' for No>>>");//Option to play again
			choice = input.nextInt();
		}while(choice == 1);//go up the program to the do { and repeat the method
		
		
		while(choice == 2)// while choice is equal to 2 
		{
			System.out.println("Player1's final score is: " + player1score);// stop playing the game and
			System.out.println("Player2's final score is: " + player2score);// print out the players final scores
			
			break;
		}
		
		private class 
		
		
	}
}