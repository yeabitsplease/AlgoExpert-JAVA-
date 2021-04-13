import java.util.*;


//O(n) time | O(1) space where n is the length of the input string
// The constant space is because the input string only has lowercase
//english alphabet letters: thus, our hash table will never have more than
//26 character frequencies

class FirstNonRepeatingCharacter {

  public int firstNonRepeatingCharacter(String string) {
    HashMap<Character, Integer> characterFrequencies = new HashMap<Character, Integer>();
		
		for(int idx = 0; idx < string.length(); idx++){
			char character = string.charAt(idx);
			characterFrequencies.put(character, characterFrequencies.getOrDefault(character, 0) + 1);
		}
		
		for(int idx = 0; idx < string.length(); idx++){
			char character = string.charAt(idx);
			if(characterFrequencies.get(character) == 1){
				return idx;
			}
		}
		return -1;
  }
}
