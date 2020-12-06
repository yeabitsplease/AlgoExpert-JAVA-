
/*
A “special array” is a non-empty array that contains either integers or other “special arrays” (i.e. subarrays of integers). 
The product sum of a “special array” is the sum of its elements, where the inner “special arrays” are added themselves and then multiplied by how deep they are in the original array. For instance, the depth of [] is 1; the depth of the inner array in [[]] is 2; and the depth of the innermost array in [[[]]] is 3.
Taking in a “special array”, write a function that returns the product sum of a “special array”.
Sample Input: array=array = [5, 2, [7, -1], 3, [6, [-13, 8], 4]]
Sample Output: 12 (calculated as: 5 + 2 + 2*(7 + -1) + 3 + 2*(6 + 3 * (-13 + 8))
*/


import java.util.*;

class ProductSum {

  public static int productSum(List<Object> array) {
    return productSumHelper(array,1);
  }
	
	public static int productSumHelper(List<Object> array, int multiplier){
		int sum=0;
		for(Object el:array){
			if(el instanceof ArrayList){
				
				ArrayList<Object> ls=(ArrayList<Object>) el;
				sum+=productSumHelper(ls,multiplier+1);
			} else{
				sum+=(int) el;			
			}
	}
		return sum*multiplier;
	}
}
