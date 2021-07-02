
public class Runner {
	
	public static void main(String[] args) {
		
		
		 Sport f = new Football("Football", 22, "BallSport", 11, "Man United", "Liverpool", "Lee Atkins"); 
		 System.out.println(f.getName());
		 System.out.println(((Football) f).getReferee());
		 
		 
		 Sport f2 = new Football();
		 ((Sport) f2).setName("Football 1");
		 f2.getName();
		 
		// Sport boxing = new Boxing("");
		// boxing.getName();
		 
		 ((Football) f2).start(); //Interface method overriding example
		 
		 
	}
	
 
}
