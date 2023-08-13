package Week06;

public class Card {
	
	private int value;
	private String name;
	private String suit;
	
	Card(String name, String suit, int value){
		this.name = name;
		this.suit = suit;
		this.value = value;
	}
	
	public void describe() {
		System.out.println(name + " of " + suit + ": " + value);
	}
	
	// Getters and setters for VALUE and NAME
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public String getname() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

}
