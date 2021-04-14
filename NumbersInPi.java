/*

Given a string representation of the first n digits of Pi
and a list of positive integers(in string format). Write a function
that returns the smallest numbers of spaces that can be added to the n digits of
Pi such that all resulting numbers are found in the list of Integers

eg: Pi --> 3141592
		Numbers --> [3141 , 5 , 31 , 2 , 4159 , 9 , 42]
		
		Output: 2 Explaination: 31 4159 2
		
*/

import java.util.*;

class NumbersInPi {
  public static int numbersInPi(String pi, String[] numbers) {
    Set<String> numbersTable = new HashSet<String>();
		for(String number : numbers){
			numbersTable.add(number);
		}
		
		Map<Integer, Integer> cache = new HashMap<Integer, Integer>();
		int minSpaces = getMinSpaces(pi, numbersTable, cache, 0);
		return minSpaces == Integer.MAX_VALUE ? -1 : minSpaces; 
  }
	
	public static int getMinSpaces(String pi, Set<String> numbersTable, Map<Integer, Integer> cache, int idx){
		if(idx == pi.length()) return -1;
		if(cache.containsKey(idx)) return cache.get(idx);
		int minSpaces = Integer.MAX_VALUE;
		for(int i = idx; i < pi.length(); i++){
			String prefix = pi.substring(idx, i + 1);
			if(numbersTable.contains(prefix)){
				int minSpacesInSuffix = getMinSpaces(pi, numbersTable, cache, i+1);
				
				if(minSpacesInSuffix == Integer.MAX_VALUE){
					minSpaces = Math.min(minSpaces, minSpacesInSuffix);
				} else{
					minSpaces = Math.min(minSpaces, minSpacesInSuffix + 1);
				}
			}
		}
		cache.put(idx, minSpaces);
		return cache.get(idx);
	}
}
