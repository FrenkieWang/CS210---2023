package autumn2015;

public class Q3_a {
	public static void main (String args[]) {
		for(int i = 1; i <= 100; i++) {
			String output = "";
			if(i % 3 == 0) output = "Fizz";
			if(i % 5 == 0) output = "Buzz";
			if(i % 3 == 0 && i % 5 == 0) output = "Fizzbuzz";
			if (output.isEmpty()) output = String.valueOf(i);
			System.out.println(output);
		}
		
	}

}
