package Games;
import java.util.Random;
public class War {

	public static void main(String[] args) 
	{

		Random rand = new Random();

		int  player1 = rand.nextInt(50) + 1;
		int  player2 = rand.nextInt(50) + 1;
		int score = 0;
		
		
		System.out.println("Player1's number is: " + player1);
		System.out.println("Player2's number is: " + player2);
		
		while(player1 > player2)
		{
			
			System.out.println("Player1's score is now: " + score);
			score++;
				break;
		}
		while(player2 > player1)
		{
			System.out.println("Player2's score is now: " + score);
			score++;
				break;
		}
		
		
		
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
