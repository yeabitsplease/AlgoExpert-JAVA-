// KADANE'S ALOGORITHM

/* Write an efficient program to find the sum of contiguous subarray within
a one-dimensional array of numbers which has the largest sum.
*/
import java.util.*;
public class max_subset_sum {
    public static void main(String args[]){
    int a[]={-2,-3,4,-1,-2,1,5,-3};
    
    System.out.println("Maximum sum is: "+ kadane(a));
    }
    
    static int kadane(int x[]){
    int local_max=x[0],global_max=x[0];
    
    for(int i=1;i<x.length-1;i++){
      local_max=Math.max(x[i],x[i]+local_max);
       if(local_max>=global_max){
       global_max=local_max;
       }    
    
    
    }
    
    
    
    return global_max;
        
        
        
    
    }
 }
