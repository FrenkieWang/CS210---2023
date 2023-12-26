package january2023;

public class Q1_f {
	
	public static void main (String args[]) {
	}
	
	public static void complexity(int n){
		 int counter=0;
		 
		 for(int i = n; i>500; i--){ 
			 for(int j=6; j<6*n; j=j+n){
				 counter++;
			 }
		 }
	}
}
