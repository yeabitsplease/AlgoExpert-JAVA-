
/*
Write a function that takes in an integer n and returns the nth fibonacci number.
TIME COMPLEXITY: O(n)
SPACE COMPLEXITY: O(1)
*/
class Fibonacci{
	public static int getNthFibonacci(int n){
		int[] lastTwo={0,1};
		int counter=3;
		while(counter<=n){
			int nextFib=lastTwo[0]+lastTwo[1];
			lastTwo[0]=lastTwo[1];
			lastTwo[1]=nextFib;
			counter++;
		}
		return n>1? lastTwo[1]:lastTwo[0];
	}
}