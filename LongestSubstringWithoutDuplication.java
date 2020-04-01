/*
Given a string, find the length of the longest substring without repeating characters.

Example 1:

Input: "abcabcbb"
Output: 3 
Explanation: The answer is "abc", with the length of 3. 
Example 2:

Input: "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3. 
             Note that the answer must be a substring, "pwke" is a subsequence and not a substring.




*/


import java.util.*;
public class LongestSubstringWithoutDuplication {
    static int lengthOfLongestSubstring(String s) {

        
        int i=0; int j=0; int max=0;
        HashSet<Character> h=new HashSet<Character>();
        
        while(j<s.length()){
            
            
            if(!h.contains(s.charAt(j))){
                
                h.add(s.charAt(j));
                j++;
                max=Math.max(h.size(),max);
                
            }
            
            else{
                
                h.remove(s.charAt(i));
                i++;
                    
                
            }
            
            
        }
        
        return max;
        
    }
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

System.out.println("Enter the String: ");
String s=sc.nextLine();
int result=lengthOfLongestSubstring( s); 
System.out.println(result);
}


}

