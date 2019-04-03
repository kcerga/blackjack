package blackjack;

/**
 * Class for the "dealer" of the Blackjack-game.
 *
 */
public class dealer {
	public int dealerScore = 0;
	card dealerCard;
	cardDeck dealerDeck;
	int continueOrNot = 0;
	private int addDealerScore = 0;
	
	//Constructor
	dealer(cardDeck newDeck) {
		this.dealerDeck = newDeck;
		//First card
				dealerDeck.shuffleDeck();
				dealerCard = dealerDeck.firstCard();
				
				 addDealerScore = dealerCard.tellCardNumber();
				dealerScore = dealerScore + addDealerScore;	
				
				//Prints the current card information and score
				System.out.println("	Dealer's first card is: " + dealerCard.tellSuit() + " " + dealerCard.tellCardNumber());
				
		//Second card
				dealerDeck.shuffleDeck();
				dealerCard = dealerDeck.firstCard();
				
				 addDealerScore = dealerCard.tellCardNumber();
				dealerScore = dealerScore + addDealerScore;	
			
				System.out.println("	Dealer's second card is: " + dealerCard.tellSuit() + " " + dealerCard.tellCardNumber());
				
				if (dealerScore >= 17) {
					System.out.println("	Dealer's current score is: " + dealerScore);
					System.out.println("The dealer decided not to draw anymore.");
				}
				
				else { 
					playGame();
				}
		
	}
	
	//Method to play the game
	private void playGame() {
		
		System.out.println("	Dealer's current score is: " + dealerScore);
	
			continueOrNot = 1;
		
		while (continueOrNot == 1) {
			System.out.println("The dealer decided to draw again.");
				dealerDeck.shuffleDeck();
				dealerCard = dealerDeck.firstCard();
				
				int addDealerScore = dealerCard.tellCardNumber();
				dealerScore = dealerScore + addDealerScore;	
				
				System.out.println("	Dealer's card is: " + dealerCard.tellSuit() + " " + dealerCard.tellCardNumber());
				System.out.println("	Dealer's current score is: " + dealerScore);
				
				if (dealerScore >= 17) {
					System.out.println("The dealer decided not to draw anymore.");
					continueOrNot = 2;
				}
			}
		
		
	}

	public int returnScore() {
		return dealerScore;
	}
}
