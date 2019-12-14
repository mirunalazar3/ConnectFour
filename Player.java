//Miruna Andreea Lazar 2459499L

public class Player{
	//private attributes
	private String name;
	private char counter;
	
	//constructor for player
	public Player(String name,char counter){
		this.name = name; 
		this.counter = counter;
	}
	
	//public getters to allow other parts of the program access the private variables
	public String getName(){
		return name;
	}
	public char getCounter(){
		return counter;
	}
	
	//toString for name
	public String toString(){
		return getName();
	}
}