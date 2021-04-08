"""

Given an array of positive integers representing the values of  coins in your possession, write a fuction that returns the minimum amount of change that you cannot create.

EG:  1)[1 , 2 , 5]  ---> 4
	 2)[5, 7 , 1 , 1 , 2 , 3 , 22]  ---> 20

"""

def nonConstructibleChange(coins):
    
    coins.sort();
	
	currentChangeCreated = 0;
	for coin in coins:
		if coin > currentChangeCreated + 1:
			return currentChangeCreated + 1
		
		currentChangeCreated += coin
		
	return currentChangeCreated + 1
