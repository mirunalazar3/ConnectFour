//Miruna Andreea Lazar 2459499L

import java.util.Random;
public class ConnectFour{
	public static void main(String[] args){
		Board board = new Board (6,7);
   	    Player p1 = new Player("Clive", 'o');
   	    Player p2 = new Player("Sharon", 'x');
   	    board.add(new Counter(p2),6);
   	    board.add(new Counter(p1),3);
   	    board.add(new Counter(p2),4);
   	    board.add(new Counter(p1),4); 
   	    board.add(new Counter(p2),5);
   	    board.add(new Counter(p1),5);
   	    board.add(new Counter(p2),6);
   	    board.add(new Counter(p1),5);
   	    board.add(new Counter(p2),6);
   	    board.add(new Counter(p1),6);
   	    System.out.println(board);
  
		randomGame();
	   }
	//generate a random number within a range
	private static int getRandomColumn(int min, int max){
		if(min >= max){
			throw new IllegalArgumentException("max must be greater than min");
		 }
		Random random = new Random();
		return random.nextInt((max - min) + 1) + min;//formula that will generates a random integer in a range between min and max
	}

	//two players play randomly
	public static void randomGame() {
		//create players
		Player playerOne = new Player ("PlayerOne",'o');
		Player playerTwo = new Player ("PlayerTwo",'x');
		//create board
		Board board = new Board (6,7);
		//random move while board is not full
		while(board.isFull() == false){
			board.columns[getRandomColumn(0,board.column-1)].add(new Counter(playerOne));
			board.columns[getRandomColumn(0,board.column-1)].add(new Counter(playerTwo));
			System.out.println(board);
		}
	}	
}