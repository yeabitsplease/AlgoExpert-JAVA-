"""

Write a fucntion that takwes in an array of integers and returns its powerset

"""

#O(n*2^n) time || o(n*2^n) space
def powerset(array):
    subsets = [[]]
	for ele in array:
		for i in range(len(subsets)):
			currentSubset = subsets[i]
			subsets.append(currentSubset + [ele])
	return subsets
