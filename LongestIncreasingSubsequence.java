import java.util.*;

class LongestIncreasingSubsequence {
  public static List<Integer> longestIncreasingSubsequence(int[] array) {
    int[] sequences = new int[array.length];
		Arrays.fill(sequences, Integer.MIN_VALUE);
		int[] length = new int[array.length];
		Arrays.fill(length, 1);
		int maxLengthIdx = 0;
		for(int i = 0; i < array.length; i++){
			int currentNum = array[i];
			for(int j = 0; j < i; j++){
				int otherNum = array[j];
				if(otherNum < currentNum && length[j] + 1 >= length[i]){
					length[i] = length[j] + 1;
					sequences[i] = j;
				}
			}
			if(length[i] >= length[maxLengthIdx]){
				maxLengthIdx = i;
			}
		}
		return buildSequence(array, sequences, maxLengthIdx);
  }
	
	public static List<Integer> buildSequence(int[] array, int[] sequences, int currentIdx){
		List<Integer> sequence = new ArrayList<Integer>();
		while(currentIdx != Integer.MIN_VALUE){
			sequence.add(0, array[currentIdx]);
			currentIdx = sequences[currentIdx];
		}
		return sequence;
	}
}
