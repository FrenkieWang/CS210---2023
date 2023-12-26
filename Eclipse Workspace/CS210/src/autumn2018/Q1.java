package autumn2018;

import java.util.Scanner;
import java.util.Queue;
import java.util.PriorityQueue;

public class Q1 {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		Queue<Student> pq = new PriorityQueue<Student>();
		
		int SIZE = Integer.parseInt(sc.nextLine()); // number of students
		int RANK = Integer.parseInt(sc.nextLine()); // output rank
		
		// Create a new Student class, input its name and score
		for(int i = 0; i < SIZE; i++) {
			String inputName = sc.nextLine();
			int inputScore = Integer.parseInt(sc.nextLine());
			pq.add(new Student(inputName, inputScore));			
		}
		sc.close();
		
		for(int i = 1; i < RANK; i++) {
			 pq.poll();
		}
		System.out.println(pq.poll().name);		
	}
}

// Create a new Class - Student
// It has two properties - name, score
class Student implements Comparable<Student>{
	String name;
	int score;
	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	//Higher score has priority, when use PriorityQueue
	@Override
	public int compareTo(Student other) {
		return other.score - this.score;
	}
}