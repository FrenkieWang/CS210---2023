package january2020;

public class Q1 {
	public static void main (String args[]) {
		// Total number of Monte Carlo
		int N = 1000000;
		int count = 0;
		for (int i = 0; i < N; i++) {
			int n1 = (int) (Integer.MAX_VALUE * Math.random());
			int n2 = (int) (Integer.MAX_VALUE * Math.random());
			// Coprime number of Monte Carlo
			if(gcd(n1,n2) == 1) count++;
		}
		double probability = (double) 100 * count / (double) N;
		// Keep 2 decimal digits
		System.out.println(String.format("%.2f", probability) + " %");
	}
	
	// gcd = Greatest Common Divisor
	// If gcd(a,b) == 1, then a and b are coprime.
	public static int gcd (int a, int b) {
		if(b==0) {
			return a;
		}
		else {
			return gcd(b, a % b);
		}
	}
}

/* https://www.zhihu.com/question/397370463
	The probability that two randomly selected numbers
	are coprime is  6/π^2 ≈ 60.79%
*/
