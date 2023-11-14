package autumn2017;

import java.util.Scanner;
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Comparator;

public class Q3 {
	public static void main (String args[]) {
		//Create a priority queue that stores the information of students.
		Queue<Student> pq = new PriorityQueue<Student>(new Comparator<Student>() {
			@Override
			public int compare (Student s1, Student s2) {
				// Compare by the score first, low score comes first
				if(s1.score != s2.score) {
					return s1.score - s2.score;
				}
				//Same score -> compare their name in alphabetical order
				else {
					return s1.name.compareTo(s2.name);
				}
			}
		});
		
		Scanner sc = new Scanner (System.in);
		// Number of inputs
		int N = Integer.parseInt(sc.nextLine());
		// Input student information
		for (int i = 0; i < N ; i++) {
			String inputLine = sc.nextLine();
			String studentName = inputLine.split(" ")[0];
			int studentScore = Integer.parseInt(inputLine.split(" ")[1]);
			pq.add(new Student(studentName, studentScore));			
		}		
		
		//Get the median students
		int SIZE = pq.size();
		for (int i = 0; i < SIZE / 2 - 1; i++) {
			pq.poll();
		}
		
		//If students number is odd, get the median one
		if(SIZE % 2 == 1) {
			pq.poll();
			System.out.println(pq.peek().name);
		}
		//If students number is odd, get the median two first
		//And then select the name by alphabetical order
		else {
			Student m1 = pq.poll();
			Student m2 = pq.poll();
			if(m1.name.compareTo(m2.name) < 0) {
				System.out.println(m1.name);
			}
			else {
				System.out.println(m2.name);
			}
		}
	}

}

//Create a new Class - Student
//it stores name and score
class Student{
	String name;
	int score;
	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
}
/*
[Big O complexity] - O(n * log(n))
I use two for loops in the program,
First loop is to insert students information into a priority queue.
The loop is related to N -- Number of student inputs
The time complexity of inserting a student into priority queue is O(log(n)).
Second loop is related to N -- Number of student inputs
So the complexity is O(n) * O(logn) + O(n) = O(n * log(n))
*/