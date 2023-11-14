package labs;

public class Lab4_MonteCarloE {
	public static void main (String args[]) {
		int N = 1000000;
		int count = 0;		
		for (int i = 0; i < N ; i++) {
			double x = 1 * Math.random() + 1;
			double y = 1 * Math.random();
			if(y < 1 / x) count++;
		}
		double shadow = (double) count / (double) N; // ln2
		System.out.println(Math.pow(2, 1/shadow));					
	}
}
// https://www.jianshu.com/p/107d97423e6b