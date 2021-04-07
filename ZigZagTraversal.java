/*

Write a function that returns the zigzag traveral for the fiven n*m dimensional array.

array=  [
	[1 , 3 , 4 , 10]		
	[2 , 5 , 9 , 11]		
	[6 , 8 , 12 , 15]		
	[7 , 13 , 14 , 16]		
		]
		
output= [1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 ,11 , 12 , 13 , 14 , 15 , 16]

*/


import java.util.*;

class ZigZagTraversal {
  public static List<Integer> zigzagTraverse(List<List<Integer>> array) {
    int height=array.size()-1;
		int width=array.get(0).size()-1;
		List<Integer> result=new ArrayList<Integer>();
		int row=0;
		int col=0;
		boolean goingDown=true;
		while(!isOutOfBounds(row, col, height, width)){
			result.add(array.get(row).get(col));
			if(goingDown){
				if(col==0 || row==height){
					goingDown=false;
					if(row==height){
						col++;
					} else{
						row++;
					}
				} else{
					row++;
					col--;
				}
			} else{
				if(row==0 || col==width){
					goingDown=true;
					if(col==width){
						row++;
					} else{
						col++;
					}
				} else{
					row--;
					col++;
				}
			}
		}
		return result;
  }
	
	public static boolean isOutOfBounds(int row, int col, int height, int width){
		return row<0||row>height||col<0||col>width;
	}
}
