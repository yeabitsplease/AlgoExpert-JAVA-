def arrayOfProducts(array):
    products=[1 for _ in range(len(array))]
	
	leftProduct=1;
	for i in range(len(array)):
		products[i]=leftProduct
		leftProduct*=array[i]
		
	rightProduct=1;
	for i in reversed(range(len(array))):
		products[i]*=rightProduct
		rightProduct*=array[i]
		
	return products
