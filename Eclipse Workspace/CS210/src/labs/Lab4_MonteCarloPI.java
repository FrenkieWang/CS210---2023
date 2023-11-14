package labs;

public class Lab4_MonteCarloPI {
	public static void main (String args[]) {
		int N = 1000000;
		int count = 0;
		for (int i = 0; i < N; i++) {
			double x = Math.random();
			double y = Math.random();
			if(Math.pow(x, 2)+Math.pow(y, 2)<=1) count++;
		}
		double pQuarter = (double) count / (double) N;
		System.out.println(4 * pQuarter);
	}

}
