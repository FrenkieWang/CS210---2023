package labs;

import java.util.Scanner;

public class Lab5 {
	public static void main (String args[]) {
		Scanner sc = new Scanner (System.in);
		int base1 = Integer.parseInt(sc.nextLine());
		int base2 = Integer.parseInt(sc.nextLine());
		String N = sc.nextLine();
		sc.close();
		
		boolean isNegative = false;
		if(N.startsWith("-")) {
			isNegative = true;
			N = N.substring(1);
		}
		
		long decimalValue = convertDecimal(N, base1);
		String output = decimalConvert(decimalValue, base2, isNegative);
		System.out.println(output);			
	}
	
	public static long convertDecimal (String input, int base1) {
		long decimalValue = 0;
		for(int i = 0; i < input.length(); i++) {
			char digit = input.charAt(i);
			int digitValue;
			if(Character.isDigit(digit)) {
				digitValue = digit - '0';
			}
			else {
				digitValue = digit - 'a' + 10;
			}
			decimalValue = decimalValue * base1 + digitValue;
		}
		return decimalValue;
	}
	
	public static String decimalConvert (long input, int base2, boolean isNegative) {
		StringBuffer sb = new StringBuffer();
		long decimalValue = input;
		while(decimalValue > 0) {
			long remainder = decimalValue % base2;
			if(remainder < 10) {
				sb.append((char)(remainder + '0'));
			}
			else {
				sb.append((char)(remainder + 'a' - 10));
			}
			decimalValue = decimalValue / base2;
		}	
		if(isNegative) sb.append('-');
		return sb.reverse().toString();
	}

}
