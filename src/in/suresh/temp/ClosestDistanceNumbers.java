package in.suresh.temp;

import java.util.Arrays;

public class ClosestDistanceNumbers {

	 public static void main(String[] args) {
	        int[] numbers = {2,3, 9, 50, 91, 15, 65, 7, 99};

	        Arrays.sort(numbers);

	        int minDistance = Integer.MAX_VALUE;
	        int firstNumber = 0;
	        int secondNumber = 0;

	        for (int i = 0; i < numbers.length - 1; i++) {
	            int distance = Math.abs(numbers[i] - numbers[i + 1]);
	            if (distance < minDistance) {
	                minDistance = distance;
	                firstNumber = numbers[i];
	                secondNumber = numbers[i + 1];
	                if (minDistance == 0) {
	                    // If the minimum distance is 0, no need to continue, break the loop.
	                    break;
	                }
	            }
	        }

	        System.out.println("The closest numbers are " + firstNumber + " and " + secondNumber);
	    }
}
