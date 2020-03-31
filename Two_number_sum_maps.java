/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

*/


import java.util.*;
public class Two_number_sum_maps {
    
    public static void main(String args[]){
    
        int numbers[]=new int[] {2,3,7,4,8};
        //for(int i=0;i<numbers.length;i++){
        //System.out.println(numbers[i]);
        int target=7;
        int result[]=getTwoSum(numbers,target);
        System.out.println(result[0]+"   "+result[1]);
    
    }
    public static int[] getTwoSum(int numbers[],int target){
    Map<Integer,Integer> numMap=new  HashMap<>();
        for(int i=0;i<numbers.length;i++){
        int delta=target-numbers[i];
        if(numMap.containsKey(delta)){
        return new int[]{i,numMap.get(delta)};
        }
        else{
        numMap.put(numbers[i],i);
        }
        }
        return new int[]{-1,-1};
    }
    
}
