package autumn2019;

public class Q4_a {
	
	public static void main(String[] args){
		 System.out.println(function(83));
	}	
	
	public static int function(int input){
		 input++;
		 if(input%13==2){
		 return 8;
		 }
		 return (function(input+2)-3); 
	}
}
