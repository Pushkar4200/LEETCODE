class Solution {
    int[][] dp;

    public int book(int lr, int lc){
        if(lr==1 && lc==1) return 1;
        if(lr<1 || lc<1) return 0;

        if(dp[lr][lc] != -1) return dp[lr][lc];

        int right = book(lr, lc-1);
        int down  = book(lr-1, lc);

        return dp[lr][lc] = right + down;
    }

    public int uniquePaths(int m, int n) {
        dp = new int[m+1][n+1];

        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                dp[i][j] = -1;
            }
        }

        return book(m,n);
    }
}