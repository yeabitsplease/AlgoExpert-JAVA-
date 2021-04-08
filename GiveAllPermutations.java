import java.util.*;

class GiveAllPermutations {
	
	//O(n*n!) time | O(n*n!) space
  public static List<List<Integer>> getPermutations(List<Integer> array) {
    List<List<Integer>> permutations = new ArrayList<List<Integer>>();
		getPermutations(array, new ArrayList<Integer>(), permutations);
  	return permutations;
	}
	
	public static void getPermutations(List<Integer> array, List<Integer> currentPermutation, List<List<Integer>> permutations){
		if(array.size() == 0 && currentPermutation.size() > 0){
			permutations.add(currentPermutation); 
		} else {
			for(int i=0; i<array.size(); i++){
				List<Integer> newArray= new ArrayList<Integer>(array);
				newArray.remove(i); 
				List<Integer> newPermutation = new ArrayList<Integer>(currentPermutation);
				newPermutation.add(array.get(i));
				getPermutations(newArray, newPermutation, permutations);
			}
		}
	}
}
