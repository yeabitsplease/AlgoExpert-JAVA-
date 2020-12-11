import java.util.*;

class ArrayProduct {
  public int[] arrayOfProducts(int[] array) {
    
		int[] products=new int[array.length];
		
		int leftProduct=1;
		for(int i=0;i<array.length;i++){
			products[i]=leftProduct;
			leftProduct*=array[i];
		}
		
		int rightProduct=1;
		for(int i=array.length-1;i>=0;i--){
			products[i]*=rightProduct;
			rightProduct*=array[i];
		}
		
		return products;
    
  }
}
