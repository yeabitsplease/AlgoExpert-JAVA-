

/*

Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.

A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.



Example 1:

Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
Example 2:

Input: digits = ""
Output: []
Example 3:

Input: digits = "2"
Output: ["a","b","c"]

*/


import java.util.*;
class Main {

  public static Map<Character,String[]> dletters=new HashMap<Character,String[]>();
	static{
		dletters.put('0',new String[] {"0"});
		dletters.put('1',new String[] {"1"});
		dletters.put('2',new String[] {"a","b","c"});
		dletters.put('3',new String[] {"d","e","f"});
		dletters.put('4',new String[] {"g","h","i"});
		dletters.put('5',new String[] {"j","k","l"});
		dletters.put('6',new String[] {"m","n","o"});
		dletters.put('7',new String[] {"p","q","r","s"});
		dletters.put('8',new String[] {"t","u","v"});
		dletters.put('9',new String[] {"w","x","y","z"});
	}
    
    public static ArrayList<String> letterCombinations(String phoneNumber) {
        if(phoneNumber.length()==0){
            return new ArrayList<>();
        };
        
        String[] currmnem=new String[phoneNumber.length()];
		Arrays.fill(currmnem,"0");
		
		ArrayList<String> mnemFound=new ArrayList<String>();
		phoneNumberMnemonicsHelper(0,phoneNumber,currmnem,mnemFound);
		return mnemFound;
    }
    
    public static void phoneNumberMnemonicsHelper(int idx, String phoneNumber, String[] currmnem, ArrayList<String> mnemFound){
		if(idx==phoneNumber.length()){
			String mnem=String.join("",currmnem);
			mnemFound.add(mnem);
		} else {
			char digit=phoneNumber.charAt(idx);
			String[] letters=dletters.get(digit);
			for(String letter: letters){
				currmnem[idx]=letter;
				phoneNumberMnemonicsHelper(idx+1,phoneNumber,currmnem,mnemFound);
		}
	}
	
}

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter phone number: ");
    String number=sc.nextLine();
    ArrayList<String> result=new ArrayList<String>();
    result=letterCombinations(number);

    for(int i=0;i<result.size();i++){
      String res=result.get(i);
      System.out.print(res+" ");
    }
  }
}