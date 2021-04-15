/*

Write a function that takes in an array of integers and returns the largest possible value 
for the expression array[a] - array[b] + array[c] - array[d], where a, b, c, d
are indices of the array and a < b < c < d.
If the input array has fewer than 4 elements, your function should return 0.

eg: array --> [ 3 , 6 , 1 , -3 , 2 , 7]
    output --> 4 // a = 1, b = 3, c = 4, d = 5 so 6 - (-3) + 2 - 7 = 4 

*/
import java.util.*;

class MaximizeExpression {

	//O(n) time || O(n) space
  public int maximizeExpression(int[] array) {
    if(array.length < 4){
			return 0;
		}
		
		ArrayList<Integer> maxOfA = new ArrayList<Integer>(Arrays.asList(array[0]));
		ArrayList<Integer> maxOfAMinusB = new ArrayList<Integer>(Arrays.asList(Integer.MIN_VALUE));
		ArrayList<Integer> maxOfAMinusBPlusC = new ArrayList<Integer>(Arrays.asList(Integer.MIN_VALUE, Integer.MIN_VALUE));
		ArrayList<Integer> maxOfAMinusBPlusCMinusD = new ArrayList<Integer>(Arrays.asList(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE));														
		
		for(int idx = 1; idx < array.length; idx++){
			int currentMax = Math.max(maxOfA.get(idx - 1), array[idx]);
			maxOfA.add(currentMax);
		}
		
																																	
		for(int idx = 1; idx < array.length; idx++){
			int currentMax = Math.max(maxOfAMinusB.get(idx - 1), maxOfA.get(idx - 1) - array[idx]);
			maxOfAMinusB.add(currentMax);
		}
																																	
		 for(int idx = 2; idx < array.length; idx++){
			int currentMax = Math.max(maxOfAMinusBPlusC.get(idx - 1), maxOfAMinusB.get(idx - 1) + array[idx]);
			maxOfAMinusBPlusC.add(currentMax);
		}
																																	
		 for(int idx = 3; idx < array.length; idx++){
			int currentMax = Math.max(maxOfAMinusBPlusCMinusD.get(idx - 1), maxOfAMinusBPlusC.get(idx - 1) - array[idx]);
			maxOfAMinusBPlusCMinusD.add(currentMax);
		}
		return maxOfAMinusBPlusCMinusD.get(maxOfAMinusBPlusCMinusD.size() - 1);
  }
}
