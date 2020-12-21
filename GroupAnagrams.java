import java.util.*;
import java.util.stream.*;
`

class GroupAnagrams{
  public static List<List<String>> groupAnagrams(List<String> words) {
    if(words.size()==0) return new ArrayList<List<String>>();
		
		List<String> sortedWords=new ArrayList<String>();
		for(String word:words){
			char[] charArray =word.toCharArray();
			Arrays.sort(charArray);
			String sortedWord=new String(charArray);
			sortedWords.add(sortedWord);;
		}
		List<Integer> indices=IntStream.range(0,words.size()).boxed().collect(Collectors.toList());
		indices.sort((a,b) -> sortedWords.get(a).compareTo(sortedWords.get(b)));
		
		List<List<String>> result=new ArrayList<List<String>>();
		List<String> currentAnagramGroup=new ArrayList<String>();
		String currentAnagram=sortedWords.get(indices.get(0));
		for(Integer index:indices){
			String word=words.get(index);
			String sortedWord=sortedWords.get(index);
			
			if(sortedWord.equals(currentAnagram)){
				currentAnagramGroup.add(word);
				continue;
			}
			
			result.add(currentAnagramGroup);
			currentAnagramGroup=new ArrayList<String>(Arrays.asList(word));
			currentAnagram=sortedWord;
		}
		result.add(currentAnagramGroup);
		return result;
	}
	
	
	
	public static void main(String args[]){
		/*
		
		------TEST CASE1------
		
		List<String> words =
        new ArrayList<String>(Arrays.asList("yo", "act", "flop", "tac", "foo", "cat", "oy", "olfp"));
		 
		List<List<String>> expected = groupAnagrams(words);
		for(int i=0;i<expected.size();i++){
          System.out.println(expected.get(i));
		} 
		*/
		
		
		
		
		
	}
}
