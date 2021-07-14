import java.util.*;
class ReverseArray{
	public static int[] reverseArray(int[] array){
		int start = array[0];
		int end = array.length - 1;
		while(start < end){
			int temp = array[end];
			array[end] = array[start];
			array[start] = temp;
			start ++;
			end --;
		}
		return array;
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i = 0; i < size; i++){
		System.out.println("Enter "+ i +" element: ");
		arr[i] = sc.nextInt();
		}
		reverseArray(arr);
		for(int j = 0; j < arr.length; j++){
			System.out.print(arr[j] + " ");
		}
		
		
	}
}