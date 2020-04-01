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

