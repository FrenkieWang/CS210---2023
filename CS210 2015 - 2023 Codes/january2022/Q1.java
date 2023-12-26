package january2022;

public class Q1 {
	public static void main (String args[]) {
		int noRemainder = 1;
		// Aggregate the LCM from 1 to 20.
		for (int i = 1 ; i <= 20; i++) {
			noRemainder = lcm (noRemainder, i);
		}
		System.out.println(noRemainder);		
	}
	
	// Greatest Common Divisor
	public static int gcd (int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}
	
	// Least Common Multiple
	// LCM(a,b) = a X b / GCD(a,b)
	public static int lcm (int a, int b) {
		return (a * b) / gcd(a, b);
	}

}
