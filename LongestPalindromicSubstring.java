/*

Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

Example 1:

Input: "babad"
Output: "bab"
Note: "aba" is also a valid answer.
Example 2:

Input: "cbbd"
Output: "bb"

*/


import java.util.*;
class LongestPalindromicSubstring{ 
static String longestPalindrome(String s) {
     
        int n=s.length();
        if(n<1||s==null){
            
            return "";
        }
        
        else{
            
         int begin=0;
         int end=0;
            for(int i=0;i<n;i++){
                
                int length1=findLength(s,i,i);
                int length2=findLength(s,i,i+1);
                
                int maxlength=Math.max(length1,length2);
                if(maxlength>end-begin){
                    
                    begin=i-((maxlength-1)/2);
                    end=i+(maxlength)/2;
                    
                }
            }
            
            return s.substring(begin,end+1);
            
        }
    }
    
    static int findLength(String str,int first,int second){
        
        while(first>=0&&second<str.length()&&str.charAt(first)==str.charAt(second)){
            
            first--;
            second++;
            
        }
        
        return second-first-1;
        
    }
    


public static void main(String args[]){

Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
String result;
    result = longestPalindrome(str);
System.out.println(result);
}
}
