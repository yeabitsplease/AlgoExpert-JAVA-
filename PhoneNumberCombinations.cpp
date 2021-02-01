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

/**/


#include <vector>
#include <numeric>
#include <unordered_map>
using namespace std;

void phoneNumberMnemonicsHelper(int idx, string phoneNumber, vector<char> &currentMnemonic, vector<string> &mnemonicsFound);
unordered_map<int, vector<char>> dletters{
	{0,{'0'}} , {1,{'1'}} , {2,{'a','b','c'}} , {3,{'d','e','f'}} ,
	 {4,{'g','h','i'}} , {5,{'j','k','l'}} , {6,{'m','n','o'}} ,
	 {7,{'p','q','r','s'}} , {8,{'t','u','v'}} , {9,{'w','x','y','z'}} 
};

vector<string> phoneNumberMnemonics(string phoneNumber) {
  vector<char> currentMnemonic(phoneNumber.size(),'0');
	vector<string> mnemonicsFound;
	cout << (int)'4' << endl;
	phoneNumberMnemonicsHelper(0, phoneNumber, currentMnemonic, mnemonicsFound);
	return mnemonicsFound;
}

void phoneNumberMnemonicsHelper(int idx, string phoneNumber, vector<char> &currentMnemonic, vector<string> &mnemonicsFound){
	if(idx==phoneNumber.size()){
		string mnemonic=accumulate(currentMnemonic.begin(), currentMnemonic.end(),
															string{});
		mnemonicsFound.push_back(mnemonic);
	} else {
		int digit=phoneNumber[idx]-'0';
		vector<char> letters=dletters[digit];
		for(auto letter : letters) {
			currentMnemonic[idx]=letter;
			phoneNumberMnemonicsHelper(idx+1, phoneNumber, currentMnemonic, mnemonicsFound);
		}
	}
}

