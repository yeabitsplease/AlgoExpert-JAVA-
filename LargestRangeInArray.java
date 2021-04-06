/*

Return the starting and ending indices of the largest range in the array.

*/

import java.util.*;

class LargestRangeInArray {
  public static int[] largestRange(int[] array) {
  	int[] largestRange=new int[2];
		int longestLength=0;
		Map<Integer, Boolean> nums=new HashMap<Integer, Boolean>();
		for(int num: array){
			nums.put(num, true);
		}
		for(int num: array){
			if(!nums.get(num)){
				continue;
			}
			nums.put(num,false);
			int currentLength=1;
			int left=num-1;
			int right=num+1;
			while(nums.containsKey(left)){
				nums.put(left,false);
				currentLength++;
				left--;
			}
			while(nums.containsKey(right)){
				nums.put(right,false);
				currentLength++;
				right++;
			}
			if(currentLength>longestLength){
				longestLength=currentLength;
				largestRange=new int[] {left+1, right-1};
			}
		}
		return largestRange;
  }
}
