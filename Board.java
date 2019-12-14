//Miruna Andreea Lazar 2459499L

public class Board{
	int row;
	int column;
	Column columns[];
	
	//constructor that takes rows and columns in argument
	public Board(int r, int c){
		this.row = r;
		this.column = c;
		columns = new Column[column];//array with column element
		for(int i=0; i<column; i++){
			columns [i] = new Column(row);
		}
	 } 
	
	//boolean method returns true if the board successfully adds the counter to that column, and false otherwise. 
	public boolean add(Counter object, int column){
		return columns[column].add(object);
	}
	
	//String toString to produce a String representation of the board
	public String toString(){
		String a = "|";
		for(int i=0; i<column; i++){ 
			a = a + Integer.toString(i)+ "|"; //header
		}
		a = a + "\n";
		for(int i=0; i<2*column+1; i++){ //line that separates header from the rest of the table
			a = a + "-";
		}
		a = a + "\n";
		for(int i=0; i<row; i++){ //the rest of the table
			   a = a + "|";
			   for(int j=0; j<column;j++){ 
			    a = a + this.columns[j].displayRow(i) + "|";
			   }
			   a = a + "\n";
			  }
		return a;
	}
	
	//boolean isFull() to check whether the board is full
	public boolean isFull(){
		for (int i=0; i<columns.length; i++){
			 if (columns[i].isFull()==false)
			 return false;
		}return true;
	}
}	