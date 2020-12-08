class 2DMatrixSearch {
    public boolean searchMatrix(int[][] matrix, int target) {
        //block.length // the number of rows
//block[0].length // the number of columns on row 0
//block[1].length // the number of columns on row 1
// etc
        int i=matrix.length-1;
        int j=0;
        while(i>=0 && j<matrix[0].length){
            if(matrix[i][j]>target){
                i--;
            }
            else if(matrix[i][j]<target){
                j++;
            }
            else{
                return true;
            }
        }
        return false;
    }
}