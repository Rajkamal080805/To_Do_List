class Solution {
    public int[][] transpose(int[][] matrix) {
           int n=matrix[0].length;
        int[][] res=new int[n][matrix.length]; 
     
        for(int i=0;i<matrix.length;i++){  
            for(int j=0; j<n;j++){
               res[j][i]= matrix[i][j];
            }
        } 
        return res;
    }
}