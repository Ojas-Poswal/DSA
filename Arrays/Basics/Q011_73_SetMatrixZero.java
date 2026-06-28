package Arrays.Basics;
//it's simple , we can use two boolean arrays to keep track of which rows and columns should be set to zero. First, we iterate through the matrix to find all the zeros and mark the corresponding rows and columns in the boolean arrays. Then, we iterate through the matrix again and set the elements to zero if their row or column is marked.
class Solution {
    public void setZeroes(int[][] matrix) {
       boolean []row = new boolean[matrix.length];
       boolean []col = new boolean[matrix[0].length];

       for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
            if(matrix[i][j]==0){
                row[i]=true;
                col[j]=true;
            }
        }
       }

       for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
            if(row[i] || col[j]){
                matrix[i][j]=0;
            }
        }
       }
    }
}
