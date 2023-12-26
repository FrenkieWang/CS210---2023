package january2023;

public class Q1_c {
	
	 public static void main(String[] args){
		 System.out.println(recursion(26));
	 }
	 
	 public static int recursion(int x){ 		 
		 if(x % 9 < 3){
			 return 8;
		 }
		 else{
			 return x % recursion(x - 2) + 1;
		 }		 
	 } 
}
