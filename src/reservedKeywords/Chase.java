package reservedKeywords;

public class Chase  extends Rainbow {
	
	Chase (String job, double salary, String skills){
		super(job, salary, skills); 
	}
	
	public void dislay() {
		System.out.println(" " + job + "\t " + salary + "\t " + skills) ;
	}
	
	// main 
	public static void main(String[] args) {
		Chase c = new Chase(job, salary, skills); 
		
		c.dislay();
	}

}
