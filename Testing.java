public class Testing{
	 public static void main(String[]args) {
		 //Testing Task 1.c.
		 Player p1 = new Player ("Clive", 'x');
		 Counter c = new Counter(p1);
		 System.out.println(c.getPlayer().toString() + ", " + c.toString());
		 
		 //Testing Task 1.d.
    	 Player p2 = new Player("A", 'x');
    	 Player p3 = new Player("B", 'y');
    	 Counter c1 = new Counter(p2);
    	 Counter c2 = new Counter (p3);
    	 Counter c3 = new Counter (p2);
    	 System.out.println(c1.equals(c2));
    	 System.out.println(c1.equals(c3));
    	 
    	 //Testing Task 2.c.
    	 Column col = new Column(4);
    	 for(int i=0;i<5;i++) {
    		 Boolean result = col.add(new Counter(p1));
    		 System.out.println(result);
    	 }
    	 //Testing Task 2.e.
    	 Column col1 = new Column (6);
    	 Player p4 = new Player("Clive",'o');
    	 Player p5 = new Player("Sharon",'x');
    	 for(int i=0;i<3;i++) {
    		 col1.add(new Counter(p4));
    		 col1.add(new Counter(p5));
    	 }
    	 col1.display();
    	 //Testing Task 3.d. 
    	 Board board = new Board (6,7);
    	 Player cl = new Player("Clive", 'o');
    	 Player s = new Player("Sharon", 'x');
    	 board.add(new Counter(s),6);
    	 board.add(new Counter(cl),3);
    	 board.add(new Counter(s),4);
    	 board.add(new Counter(cl),4); 
    	 board.add(new Counter(s),5);
    	 board.add(new Counter(cl),5);
    	 board.add(new Counter(s),6);
    	 board.add(new Counter(cl),5);
    	 board.add(new Counter(s),6);
    	 board.add(new Counter(cl),6);
    	 System.out.println(board);
     }
}