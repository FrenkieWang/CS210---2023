package january2018;

public class Q4_1 {
	public static void main (String args[]) {
		System.out.println(mystery("Start"));
	}
	
	public static String mystery(String input){
		 if(input.length()>10){
			 return "Complete";
		 }
		 System.out.println("Running...");
		 return (mystery(input+"x")+"OK");
	} 

}
