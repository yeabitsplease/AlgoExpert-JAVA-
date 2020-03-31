/*
Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

Note: For the purpose of this problem, we define empty string as valid palindrome.

Example 1:

Input: "A man, a plan, a canal: Panama"
Output: true
Example 2:

Input: "race a car"
Output: false


*/


import java.util.*;
public class ValidPalindrome {
    public boolean isPalindrome(String s){
    
    int i=0;int j=s.length()-1;int flag=0;
    
        while(i<j){
        while(i<j&& !Character.isLetterOrDigit(s.charAt(i))){
        i++;
        }
        
        while(i<j&& !Character.isLetterOrDigit(s.charAt(j))){
        j--;
        }
        if(i<j && Character.toLowerCase(s.charAt(i++))!= Character.toLowerCase(s.charAt(j--))) {
        
        
        return false;           
        }
        }
  
   return true;         
      
    }
    
    
    public static void main(String args[]){
        boolean res;
    Scanner sc=new Scanner(System.in);
    String st=sc.nextLine();
    validpalindrome vp=new validpalindrome();
     res=vp.isPalindrome(st);
     System.out.println(res);
    
    
    }
}
