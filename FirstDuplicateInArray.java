import java.util.*;

class FirstDuplicateInArray {
  //O(n) time | O(n) space - where n is the length of input array
  public int firstDuplicateValue(int[] array) {
    HashSet<Integer> hashset = new HashSet<Integer>();
		for(int val : array){
			if(hashset.contains(val)) return val;
			hashset.add(val);
		}
		return -1;
  }
}
