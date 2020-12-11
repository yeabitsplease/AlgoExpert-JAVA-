class ArrayProduct {
	
  func arrayOfProducts(_ array: [Int]) -> [Int] {
    var products=[Int](repeating:1,count:array.count)
		
		var leftProduct=1
		for i in 0..<array.count{
			products[i]=leftProduct
			leftProduct*=array[i]
		}
		
		var rightProduct=1
		for i in stride(from:array.count-1, through:0, by:-1){
			products[i]*=rightProduct
			rightProduct*=array[i]
		}
		return products
  }
}
