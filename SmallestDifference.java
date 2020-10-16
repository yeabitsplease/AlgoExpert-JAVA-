/*

Given Two non empty arrays, find pair of number one from each array whose absolute difference is closest to zero and return array with these two numbers.

*/
import java.util.*;
class SmallestDifference{
	
	public static int[] smallestDifference(int[] arrOne, int arrTwo){
		Arrays.sort(arrOne);
		Arrays.sort(arrTwo);
		int idxOne=0;
		int idxTwo=0;
		int smallest=Integer.MAX_VALUE;
		int current=Integer.MAX_VALUE;
		int smallestPair[]=new int[2];
		
		while(idxOne<arrOne.length && idxTwo<arrTwo.length){
			int firstnum=arrOne[idxOne];
			int secondnum=arrTwo[idxTwo];
			if(firstnum<secondnum){
				current=secondnum-firstnum;
				idxOne++;
			}
			else if(firstnum>secondnum){
				current=firstnum-secondnum;
				idxTwo++;
			}
			else{
				return new int[]{firstnum,secondnum};
			}
			if(smallest>current){
				smallest=current;
				smallestPair=new int[]{firstnum,secondnum};
			}
		}
		return smallestPair;
	}
	
	public static void main(String args[]){
		int[] arrOne=new int[10];
		int[] arrTwo=new int[10];
		for(int i=0i<10;i++){
			arrOne[i]=sc.nextInt();
		}
		for(int j=0;j<10;j++){
			arrOne[j]=sc.nextInt();
		}
		
		int[] res=smallestDifference(arrOne,arrTwo);
		for(int k=0;k<2;k++){
			System.out.println(res);
		}
	}
}