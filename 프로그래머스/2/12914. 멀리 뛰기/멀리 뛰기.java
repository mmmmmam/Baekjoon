class Solution {
    public long solution(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        
        int MOD = 1234567;
        int[] dp = new int[n + 1];
        
        // 초기 조건
        dp[1] = 1;
        dp[2] = 2;
        
        // 점화식에 따라 dp 배열 채우기
        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % MOD;
        }
        
        return dp[n];
    }
}