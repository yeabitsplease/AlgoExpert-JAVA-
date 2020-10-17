/*
Write a function that takes in an array of integers and return the length of the longest peak in the array.
A peak is defined as adjacent integers in the array that are strictly increasing until they reach the tip(the highest value in the peak), at which
point they become striclty decreasing.
At least 3 integers are required to form a peak.
*/
class LongestPeak{
	public static int longestPeak(int[] array){
		int LongestPeakLength=0;
		int i=1;
		while(i<array.length-1){
			boolean isPeak=array[i-1]<array[i] && array[i+1]<array[i];
			if(!isPeak){
				i++;
				continue;
			}
			
			int leftIdx=i-2;
			while(leftIdx>=0 && array[leftIdx]<array[leftIdx+1]){
				leftIdx--;
			}
			
			int rightIdx=i+2;
			while(rightIdx<array.length && array[rightIdx]<array[rightIdx-1]){
				rightIdx++;
			}
			
			int currentPeakLength=rightIdx-leftIdx-1;
			LongestPeakLength=Math.max(currentPeakLength,LongestPeakLength);
			i=rightIdx;
		}
		return LongestPeakLength;
	}
}