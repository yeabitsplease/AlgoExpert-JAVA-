/*

Given two non-empty array of integers , write a function that determines whether the second array is subsequence of first.

eg:
array: [1,2,3,4,5,6,7,8,9,10]
subsequence: [2,5,8,10]

Output: true

*/

public class ValidSubsequence {

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        
            int arrIdx=0;
            int seqIdx=0;
            
            while(seqIdx<sequence.size() && arrIdx<array.size()){
            
                if(sequence.get(seqIdx).equals(array.get(arrIdx))){
                    seqIdx++;
                }
                arrIdx++;
            }
            if(seqIdx==sequence.size()) return true;
            else return false;
            
      }
    }
    
}
