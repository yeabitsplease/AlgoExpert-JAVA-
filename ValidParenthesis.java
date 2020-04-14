/*

Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Note that an empty string is also considered valid.

Example 1:

Input: "()"
Output: true
Example 2:

Input: "()[]{}"
Output: true
Example 3:

Input: "(]"
Output: false
Example 4:

Input: "([)]"
Output: false
Example 5:

Input: "{[]}"
Output: true

*/
import java.util.*;
public class ValidParenthesis {
    
    public static boolean isValidParenthesis(String str){
    Stack<Character> s=new Stack<Character>();
        if(str.length()%2!=0){
        return false;
        }
        
        else{
        
        for(char c: str.toCharArray()){
        
        if(c=='{'||c=='('||c=='['){
        s.push(c);
        }
        else if(c==')' && !s.isEmpty()&&s.peek()=='('){
            s.pop();
        }
        else if(c==']' && !s.isEmpty()&&s.peek()=='['){
            s.pop();
        }
        else if(c=='}' && !s.isEmpty()&&s.peek()=='{'){
            s.pop();
        }
            
        }
      
        }
         if(s.isEmpty()){
           return true;
            }
         else{
            return false;  
            }
    }
    
    public static void main(String args[]){
    
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    boolean result=isValidParenthesis(s);
    System.out.println(result);
    }
    
}
