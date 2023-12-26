package autumn2015;

public class Q1 {
	public static void main (String args[]) {
		int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int keyToSearch = 7;

        int result = binarySearch(sortedArray, keyToSearch);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }		
	}
	public static int binarySearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (array[mid] == key) {
                return mid; // Key found
            } else if (array[mid] < key) {
                low = mid + 1; // Search in the right half
            } else {
                high = mid - 1; // Search in the left half
            }
        }

        return -1; // Key not found
    }

}
/*
[Big O complexity] - O(n)
It depends on the length of the input array.
*/
