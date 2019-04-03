package blackjack;

import java.util.Scanner;

public class player {
	public int playerScore = 0;
	card playerCard;
	cardDeck playerDeck;
	int continueOrNot = 1;
	int addScore;
	Scanner reader = new Scanner(System.in);
	
	//Constructor
	player(cardDeck newDeck) {
		this.playerDeck = newDeck;
	
		//Shuffles deck and pulls out first 2 cards for the first player
		newDeck.shuffleDeck();
		playerCard = newDeck.firstCard();
		//Adds the value of the card in to the players score
			 addScore = playerCard.tellCardNumber();
			playerScore = playerScore + addScore;	
		System.out.println("	Players first card is: " + playerCard.tellSuit() + " " + playerCard.tellCardNumber());
			playerDeck.shuffleDeck();
			playerCard = playerDeck.firstCard();
				addScore = playerCard.tellCardNumber();
				playerScore = playerScore + addScore;	
		System.out.println("	Players second card is: " + playerCard.tellSuit() + " " + playerCard.tellCardNumber());
			
		playGame();
		
	}
	
	private void playGame() {
		System.out.println("	Your current score is: " + playerScore);
		System.out.println("Do you want to draw another card? 1 = Yes, 2 = No");
		continueOrNot = reader.nextInt();	
		
		while (continueOrNot == 1) {
				
		playerDeck.shuffleDeck();
		playerCard = playerDeck.firstCard();
			addScore = playerCard.tellCardNumber();
			playerScore = playerScore + addScore;	
			System.out.println("	Your card is: " + playerCard.tellSuit() + " " + playerCard.tellCardNumber());
				System.out.println("	Your current score is: " + playerScore);
				System.out.println("Do you want to draw another card? 1 = Yes, 2 = No");
				continueOrNot = reader.nextInt();
		
		}
				
		 if (continueOrNot == 2) {
					System.out.println("You chose not to draw anymore.");
		}
	}



public int returnScore() {
	return playerScore;
}

}