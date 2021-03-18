/*
Given a 2d matrix wherein each row and column is in sorted order and a target value.
Find if the taget value exist in the matrix, return the indices if it exists else return -1,-1
*/
import java.util.*;

class SortedMatrixSearch{
  public static int[] searchInSortedMatrix(int[][] matrix, int target) {
    int row=0;
		int col=matrix[0].length-1;
		while(row<matrix.length && col>=0){
		if(matrix[row][col]>target){
			col--;
		} else if(matrix[row][col]<target){
			row++;
		} else{
			return new int[]{row,col};
		}
	}
    return new int[] {-1, -1};
  }
}


