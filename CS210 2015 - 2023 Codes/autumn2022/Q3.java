package autumn2022;

import java.util.Scanner;

public class Q3 {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		sc.close();
		System.out.println(getProbability(x,n));	
	}
	
	public static double getProbability(int x, int n) {
		int N = 1000000;
		int classSize = n;
		int sameBirthdayNum = x;
		int count = 0;
		
		for(int i=0; i< N; i++) {
			int[] birthdays = new int[365];
			
			for (int j=0; j < classSize ; j++) {
				int randomBirthday = (int) (365 * Math.random());
				if(birthdays[randomBirthday] >= sameBirthdayNum - 1) {
					count ++;
					break;
				}
				birthdays[randomBirthday]++;
			}
		}
		return (double) 100 * count / (double) N;		
	}
}

/*
https://en.wikipedia.org/wiki/Birthday_problem
Two people in p persons has same birthday：
    n    p
	1	0.0%
	5	2.7%
	10	11.7%
	20	41.1%
	23	50.7%
	30	70.6%
	40	89.1%
	50	97.0%
	60	99.4%
	70	99.9%
*/
	
