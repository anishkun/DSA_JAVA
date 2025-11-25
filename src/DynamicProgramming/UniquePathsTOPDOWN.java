package DynamicProgramming;

public class UniquePathsTOPDOWN {

        public int uniquePaths(int m, int n) {
            dp = new int[m][n];
            for(int i=0;i<m;i++){
                Arrays.fill(dp[i],-1);
            }
            return helper(m,n,0,0);
        }
        int[][] dp;

        int helper(int m,int n,int i,int j){
            if(i>=m || j>=n)return 0;
            if(dp[i][j]!=-1)return dp[i][j];
            if(i==m-1 && j==n-1)return 1;

            return dp[i][j] = helper(m,n,i,j+1) + helper(m,n,i+1,j);
        }


}
