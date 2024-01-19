class Solution {
    public int minFallingPathSum(int[][] matrix) {
         int n = matrix.length;
        int[] prev = new int[n];
        
       
        for (int col = 0; col < n; col++) {
            prev[col] = matrix[0][col];
        }
        
        
        for (int row = 1; row < n; row++) {
            int[] curr = new int[n];
            for (int col = 0; col < n; col++) {
                curr[col] = matrix[row][col] + Math.min(Math.min(prev[Math.max(0, col - 1)], prev[col]),                prev[Math.min(n - 1, col + 1)]);
            }
            prev = curr;
        }
        
    
        int minPathSum = Integer.MAX_VALUE;
        for (int value : prev) {
            minPathSum = Math.min(minPathSum, value);
        }
        
        return minPathSum;
    }

  public static void main(String arg[]){
    int arr[][] =[[2,1,3],[6,5,4],[7,8,9]];
    System.out.println( minFallingPathSum(arr));
   
  }
}
