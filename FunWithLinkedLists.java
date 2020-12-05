public class FunWithLinkedLists {
	public void runProgram() {
		LinkedList standings = new LinkedList();
	    String[] studentList = {"Tom", "Sariah", "Spock",
	    						"Nicole", "Sam", "Chris",
	    						"Jesse", "Sarah", "Rachel",
	    						"Philip", "Lutu", "Bryce",
	    						"Craig", "Elizabeth", "Luke",
	    						"Leia", "Jabba", "Jacob",
	    						"Jeremiah", "Jude"};
	    
	    standings.populateList(studentList);
	    standings.push("Terry");
	    standings.append("John");
	    standings.remove("Luke");
	    standings.printList();	
	}
}
