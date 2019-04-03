package blackjack;
/**
 * 
 * Class for the deck of cards in the BlackJack- game
 */
import java.util.Random;

public class cardDeck {
	
	
	//Array that is the card deck. Takes 52 card-objects
	public card[] cards = new card[52];
	
	
	//Creates the card deck
	public void createDeck() {
		for (int i = 0; i < 13; i++) {
			cards[i] = new card("Hearts", i+2);
			}
		for (int i = 13; i < 26; i++) {
			cards[i] = new card("Diamonds", i-11); 
			}
		for (int i = 26; i < 39; i++) {
			cards[i] = new card("Spades", i-24); 
			}
		for (int i = 39; i < 52; i++) {
			cards[i] = new card("Club", i-37);
			}
		
	}

	//Method to shuffle the deck
	public void shuffleDeck() {
		Random rand = new Random();
		
		for (int i = 0; i < cards.length; i++) {
			 // Random for remaining positions. 
            int r = i + rand.nextInt(52 - i); 
              
             //Swaps the elements
             card temp = cards[r]; 
             cards[r] = cards[i]; 
             cards[i] = temp; 
		}
	}
	
	//Returns the first card of the pack
	public card firstCard() {
		return cards[0];
	}
	

}
