//Miruna Andreea Lazar 2459499L

public class Counter{
	//reference to player set by a constructor
	Player player;
	public Counter(Player p){
	  this.player = p;	
	}
	
	//getter for player
	public Player getPlayer(){
		return this.player; 
	}
	
	//String toString for counter
	public String toString(){
		char c = this.getPlayer().getCounter();
		return String.valueOf(c); //to return the String representation of a char
	}
	
	//getter for counter, used in column
	public String getSymbol(){
		return String.valueOf(this.getPlayer().getCounter());
	}
	
	//equals method 
	public boolean equals(Counter obj){
		if(this.player.equals(obj.getPlayer()))
		return true;
		else return false;
	}
}