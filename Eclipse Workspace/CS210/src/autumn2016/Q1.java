package autumn2016;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Q1 {
	public static void main (String args[]) {
		ArrayList<Integer> numArray = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		// the number of inputs
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			int inputNum = sc.nextInt();
			numArray.add(inputNum);
		}
		sc.close();
		
		//Use HashMap to record the repeat times of each INT
		// <Integer Value, Repeat Times>
		Map<Integer, Integer> frequencyMap = new HashMap<Integer, Integer>();
		
		// Iterate the ArrayList
        for (int number : numArray) {
        	// and calculate the repeat times
            frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
        }        

        int smallerNumber = Integer.MAX_VALUE; 
        int maxFrequency = 0;        
        
        // Convert Map to KEY-VALUE Entry 
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int currentNumber = entry.getKey();
            int currentFrequency = entry.getValue();

            // If the repeat frequency is higher
            // Or same frequency and smaller number
            if (currentFrequency > maxFrequency ||
            		(currentFrequency == maxFrequency && currentNumber < smallerNumber)) {
            	smallerNumber = currentNumber;
                maxFrequency = currentFrequency;
            }
        }
        
     // Print out the smaller number occurs most frequently
        System.out.println(smallerNumber);
	}

}

//map.getOrDefault(key, defaultValue) 
//是用于从 Map 中获取与给定键相关联的值。
//如果 Map 包含指定的键，则返回该键对应的值；否则，返回指定的默认值。


//frequencyMap.entrySet() 返回映射中的一个键值对。
//
//使用 entrySet() 方法允许你迭代 Map 中的键值对。
//每个 Map.Entry 对象都包含两个方法：getKey() 用于获取键，getValue() 用于获取值
//。这使得在遍历 Map 时更容易同时访问键和值。