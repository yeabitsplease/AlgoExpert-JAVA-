/*

Write a function that returns a new String obtained by shifting every letter in the input 
string by k positions.
EG: String="xyz"
	Key=2
	
	Output: "zab"
	
	
	Time Complexity  =O(n)
	Space Complexity =O(n)

*/
class CeasarCipherEncrypter{
	public static String cCE(String s,int key){
		char[] newLetter = new char[s.length()];
		int newkey = key % 26;
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		for(int i = 0 ; i < s.length() ; i++){
			newLetter[i] = getNewLetter(s ,charAt(i) ,newkey ,alphabet);
		}
		return new String(newLetter);
	}
	
	public static char getNewLetter(char Letter ,int key , String alphabet){
		int newLetterCode = alphabet.indexOf(Letter)+key ;
		return alphabet.charAt(newLetterCode%26);
	}
}