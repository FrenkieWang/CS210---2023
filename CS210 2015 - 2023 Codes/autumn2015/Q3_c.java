package autumn2015;

public class Q3_c {
	public static void main (String args[]) {
		int aggregate = 1;
		for(int i = 1; i <= 20; i++) {
			aggregate = leastCommonMultiple(aggregate, i);
		}
		System.out.println(aggregate);
	}
	
	public static int greatestCommonDivider(int a, int b) {
		if(b == 0) return a;
		return greatestCommonDivider(b, a % b);
	}
	
	public static int leastCommonMultiple(int a, int b) {
		return (a * b) / greatestCommonDivider(a, b);
	}

}
