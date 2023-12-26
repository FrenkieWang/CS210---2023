package january2019;

public class Q4_A {
	public static void main(String[] args){
		 System.out.println(function("Launch"));
	}
	
	 public static String function(String input){
		 System.out.println("Evaluating");
		 if(input.length()%7==0){
			 return "Exit";
		 }
		 return(function(input+"Return")+"Terminated");
	}
}
