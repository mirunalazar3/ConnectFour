//Miruna Andreea Lazar 2459499L

public class Column{
	int numRows;
	int n;//n is where the first element of the array will be inserted
	Counter columnArray[];//declared outside the constructor to be used by the rest of the methods
	
	//constructor for numRows attribute
	public Column(int numRows){
		this.numRows = numRows;
		columnArray = new Counter [numRows];//array with numRows elements
	    n = columnArray.length-1; 
	 }
	
	//isFull method checks last array element 
	public boolean isFull(){
	    if(columnArray[0] == null){
				return false;
			   }
		return true;
	}
	
	//add method 
	public boolean add(Counter object){
		if(this.isFull() == false){
			columnArray[n] = object;
			n = n-1;//using n to know at which position of the array to add the counter
			return true;
			}
		return false;
	}
	
	//displayRow method
	public String displayRow(int numRow){
		if(columnArray[numRow]!= null){
			return columnArray[numRow].getSymbol(); //getSymbol() is getPlayer().getCounter()
		}
		return " ";
	}	
	
	//display method 
	public void display() {
		for(int i=0; i<numRows; i++){
			System.out.println(columnArray[i]);	
		}
	}
}