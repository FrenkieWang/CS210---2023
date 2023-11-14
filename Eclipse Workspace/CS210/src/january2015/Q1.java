package january2015;

public class Q1 {
	public static void main (String args[]) {
		int count = 0;
		int number = 2;
		// Find the nTH Prime number
		while(count < 10001) {
			if(isPrime(number)) count++;
			number++;
		}
		// When go out the loop, return the previous number, that is the answer
		number--;
		System.out.println(number);
	}
	
	//Check whether the number is Prime
	public static boolean isPrime(int number) {
		if (number <= 1) return false;	
		
		for(int i = 2; i < number; i++) {
			if(number % i == 0) return false;			
		}
		
		return true;
	}

}
