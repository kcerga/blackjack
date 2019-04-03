package blackjack;
/**
 * 
 * Class for a singular card in the BlackJack- game
 */

public class card {
	
	private String suit;
	private int cardNumber;
	
	//Constructor
	card(String suit, int cardNumber) {
		this.suit = suit;
		this.cardNumber = cardNumber;
	}
	
	//Returns the number of the card
	public int tellCardNumber() {
		return cardNumber;
	}
	
	//Returns the suit of the card
	public String tellSuit() {
		return suit;
	}
}
