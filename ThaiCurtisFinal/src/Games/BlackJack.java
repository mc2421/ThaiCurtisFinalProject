// Our deal function will return a random card
package Games;
import java.util.Random;
import java.util.Scanner;
public class BlackJack {
	
	public static void main(String[] args)
	{
var deal = function(){
  card = Math.floor(Math.random() * 52 + 1);
  return card;
};

// Deal out our first hand
var card1 = deal();
var card2 = deal();

// This function takes a card as a parameter and returns the value
// of that card
var getValue = function(card) {
	// if its a face card, number should be set to 10        
	if(card % 13 === 0 || card % 13 === 11 || card % 13 === 12) {
		return 10;
	} else if(card % 13 === 1) {
		// What if it's an ace?
		return 11;
	} else {
		// Otherwise, we just want its number value
		return card % 13;
	}  
};
        
// Score the hand
function score() {
  return getValue(card1) + getValue(card2);
}

console.log("You have cards " + card1 + " and " + card2 +
        " for a score of " + score(card1, card2));