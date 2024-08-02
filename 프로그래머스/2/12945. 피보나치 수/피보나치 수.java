class Solution {
    private static final int MOD = 1234567;
    public int solution(int n) {
        if (n == 1) return 1;
        if (n == 2) return 1;

        // DP 배열 초기화
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 1;

        // DP를 사용하여 피보나치 수 계산
        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % MOD;
        }

        return dp[n];
    }
}