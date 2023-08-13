package Week06;

import java.util.ArrayList;
import java.util.List;


public class App {
	
	public static void main(String[] args) {

		//establishing the deck
		Deck warDeck = new Deck(); 
	
		List<Card> p1Hand = new ArrayList<Card>();
		List<Card> p2Hand = new ArrayList<Card>();
	
	
		//Establishing the players, scores and cards in hand
		Player p1 = new Player("Alex", p1Hand, 0);
		p1.setHand(p1Hand);
		p1.setScore(0);
		Player p2 = new Player("Shanaye", p2Hand, 0);
		p2.setHand(p2Hand);
		p2.setScore(0);
	
		//showing the cards
		System.out.println("---Showing the 52 cards---\n");
		warDeck.describe();
	
		//Shuffling the deck and showing the shuffled deck
		warDeck.shuffle();
		System.out.println("\n\n---Showing the shuffled Deck---\n");
		warDeck.describe();
	
		//standard for loop for players drawing cards
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				p1.draw(warDeck);
			} else {
				p2.draw(warDeck);
			}
		}
	
		//Shows what each player has in hand
		p1.describe();
		p2.describe();
	
		//standard for loop for the players to get a flip cards
		for (int i = 0; i < 26; i++) {
			Card p1Card = p1.flip();
			Card p2Card = p2.flip();
			if (p1Card.getValue() > p2Card.getValue()) {
				p1.incrementScore();
			} else if (p2Card.getValue() > p1Card.getValue()) {
				p2.incrementScore();
			}
		}
		//Displaying fist players score.
		System.out.println("\nAlexander's score is: \n" + p1.getScore());
		//Displaying second players score.
		System.out.println("\nShanayes's score is: \n" + p2.getScore());
		//Showing the winner or if it's a DRAW
		if(p1.getScore() > p2.getScore()) {
			System.out.println("\nAlexander is the WINNER!");
		} else if (p1.getScore() < p2.getScore()) {
			System.out.println("\nShanaye is the WINNER!");
		} else {
			System.out.println("\nIt is a DRAW!!!");
		}
	}
}
