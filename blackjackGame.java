package blackjack;


public class blackjackGame {

	public static void main(String[] args) {
		//Variables for the final results
		int playerFinalScore = 0;
		int dealerFinalScore = 0;
		
		//Object from deck
		cardDeck newDeck = new cardDeck();
		
		//Calls methods to create a new deck 
		newDeck.createDeck();
		
		//Creates a new player, and sends the deck
		player newPlayer = new player(newDeck);
		
		playerFinalScore = newPlayer.returnScore();
		
			System.out.println("***************");
			System.out.println("Now is the dealers turn!");
	
				//New dealer object, sends the deck and the dealer card to the object
				dealer newDealer = new dealer(newDeck);
				dealerFinalScore = newDealer.returnScore();
		
				System.out.println("***************");

			
			System.out.println("The game is over!");
			System.out.println("The final results are:"
					+ "		\n	Player's  Score:  " + playerFinalScore
					+ "		\n	Dealer Score: " + dealerFinalScore);
					
					if (playerFinalScore > dealerFinalScore && playerFinalScore <= 21) {
						System.out.println("Player  wins!");
					}
					else if ((playerFinalScore < dealerFinalScore || playerFinalScore > 21) && dealerFinalScore <= 21) {
						System.out.println("Dealer wins!");
					}
					else if (playerFinalScore > 21  && dealerFinalScore > 21){
						System.out.println("Both players lose!");
					} 
					else if (playerFinalScore == dealerFinalScore) {
						System.out.println("The game was a tie!");
					}

		}
	
	
	}


