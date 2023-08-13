package Week06;

import java.util.List;

public class Player {
	
	private String name;
	private List<Card> hand;
	private int score;
	
	
	public Player(String name, List<Card> hand, int score) {
		this.name = name;
		this.hand = hand;
		this.score = 0;
	}
	
	// Flipping and removing the used card
	public Card flip() {
		return hand.remove(0);
	}
	
	//Drawing and adding cards to hand
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	
	//Adding earned points to the winning hand
	public void incrementScore() {
		this.score++;
	}
	
	//Getters and Setters 
	public List<Card> getHand(){
		return hand;
	}
	
	public void setHand(List<Card> hand) {
		this.hand = hand;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	//Showing the players hand.
	public void describe() {
		System.out.println("\n\nPlayer: " + name + " has a score of "+ score + 
				" and the following cards:\n");
		for (Card card : hand) {
			card.describe();
		}
	}

}
