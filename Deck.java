package Week06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	List<Card> cards = new ArrayList<Card>();
	 public Deck() {
		 String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
		 String[] numbers = {"Two", "Three", "Four", "Five", "Six", "Seven", 
				 "Eight" ,"Nine", "Ten", "Jack", "Queen", "King", "Ace"};
		 for (String suit : suits) {
			 int counter = 2;
			 for (String num : numbers) {
				 Card card = new Card(num, suit, counter);
				 this.cards.add(card);
				 counter++;
			 }
		 }
	 }
	
	 public List<Card> getCards(){
		 return cards;
	 }
	 
	 public void setCards(List<Card> cards) {
		 this.cards = cards;
	 }
	 
	 public void describe() {
		 for (Card card : this.cards) {
			 card.describe();
		 }
	 }
	 
	 //Shuffling the Deck
	 public void shuffle() {
		 Collections.shuffle(this.cards);
	 }
	
	 //Removing drawn card
	 public Card draw() {
		return cards.remove(0);
	 }
	
}
