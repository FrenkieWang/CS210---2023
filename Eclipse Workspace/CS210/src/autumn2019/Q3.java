package autumn2019;

import java.util.Stack;
import java.util.Scanner;

public class Q3 {
	public static void main (String []args) {
		Stack<String> s = new Stack<String>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String inputLine = sc.nextLine();
	
			if(inputLine.toUpperCase().contains("NORTH")) {
				s.add("Go North");
			}
			if(inputLine.toUpperCase().contains("SOUTH")) {
				s.add("Go South");
			}
			if(inputLine.toUpperCase().contains("WEST")) {
				s.add("Go West");
			}
			if(inputLine.toUpperCase().contains("EAST")) {
				s.add("Go East");
			}
			if(inputLine.toUpperCase().contains("BACK")) {
				s.pop();
			}				
			if(inputLine.toUpperCase().contains("ARRIVED")) {
				sc.close();
				break;
			}
		}
		
		while(!s.isEmpty()) {
			System.out.println(overturn(s.pop()));
		}
		
	}
	
	public static String overturn (String direction) {
		switch(direction) {
			case "Go North" : return "Go South";
			case "Go South" : return "Go North";
			case "Go West"  : return "Go East";
			case "Go East"  : return "Go West";
			default			: return null;	
		}
	}

}
