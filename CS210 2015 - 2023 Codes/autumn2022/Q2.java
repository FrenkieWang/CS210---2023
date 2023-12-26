package autumn2022;

public class Q2 {
	public static void main (String args[]) {
		//The acutual Fibonacci sequence is 1, 1, 2, 3, 5, 8...
		//Is this case, the exam paper said is 1, 2, 3 ,5 ,8
		//It missed a '1', so if you want to get 1000th of sequence,
		//You need to input 1001.
		System.out.println(fibonacci(1001));
	}
	
	public static int fibonacci(int n) {
		if (n <= 1) {
			return n;
		}
		else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}

}
