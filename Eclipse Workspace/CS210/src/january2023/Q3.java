package january2023;

public class Q3 {
	public static void main (String args[]) {
		int N = 10000000;
		int sumRolls = 0;
		for(int i = 0; i < N; i++) {
			// Index 0 - 5 => Dice Number 1 - 6
			boolean dice[] = {false, false, false, false, false, false};
			int count = 0;
			while(!checkDice(dice)) {
				int roll = (int)(Math.random() * 6);
				dice[roll] = true;
				count ++;
			}
			sumRolls = sumRolls + count;
		}
		double averageNumber =  (double)sumRolls /(double) N;
		System.out.printf("%.2f\n", averageNumber);
	}

	// Check if all 6 numbers have come up
	public static boolean checkDice (boolean dice[]) {
		for(boolean number : dice) {
			if (number == false) return false;
		}
		return true;
	}
}

// The answer is 14.70