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

function phoneNumberMnemonics(phoneNumber) {
  const currentMnemonic = new Array(phoneNumber.length).fill('0');
	const mnemonicsFound = [];

	phoneNumberMnemonicsHelper(0, phoneNumber,currentMnemonic, mnemonicsFound);
	return mnemonicsFound;
}

function phoneNumberMnemonicsHelper(idx, phoneNumber, currentMnemonic, mnemonicsFound){
	if(idx===phoneNumber.length){
		const mnemonic=currentMnemonic.join('');
		mnemonicsFound.push(mnemonic);
	} else {
		const digit=phoneNumber[idx];
		const letters=dletters[digit];
		for(const letter of letters){
			currentMnemonic[idx]=letter;
			phoneNumberMnemonicsHelper(idx+1, phoneNumber, currentMnemonic, mnemonicsFound);
		}
	}
}

const dletters={
	0:['0'],
	1:['1'],
	2:['a','b','c'],
	3:['d','e','f'],
	4:['g','h','i'],
	5:['j','k','l'],
	6:['m','n','o'],
	7:['p','q','r','s'],
	8:['t','u','v'],
	9:['w','x','y','z'],
};