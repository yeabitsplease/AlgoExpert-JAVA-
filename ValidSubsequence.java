
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