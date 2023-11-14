package january2022;

public class Q2 {
	public static void main (String args[]) {
		// Total number of Monte Carlo
		int N = 1000000;
		int x,y;
		int sum = 0;
		for (int i = 0; i < N; i++) {
			x = (int) (Integer.MAX_VALUE * Math.random());
			y = (int) (Integer.MAX_VALUE * Math.random());
			// Coprime number of Monte Carlo
			if (gcd(x,y) == 1) sum++;
		}
		double p =  (double)100 * sum / (double) N;
		// Keep 2 decimal digits
		System.out.println(String.format("%.2f", p) + "%");
	}
	
	// Greatest Common Divisor
	// If gcd(a,b) == 1, then a and b are coprime.
	public static int gcd (int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}

}
// https://blog.csdn.net/liuchang0001/article/details/83728938
// https://www.zhihu.com/question/19917900