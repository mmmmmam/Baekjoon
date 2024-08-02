def solution(n):
    MOD = 1234567
    
    # n이 1 또는 2일 때
    if n == 1 or n == 2:
        return 1
    
    # DP 배열 초기화
    dp = [0] * (n + 1)
    dp[1] = 1
    dp[2] = 1
    
    # DP를 사용하여 피보나치 수 계산
    for i in range(3, n + 1):
        dp[i] = (dp[i - 1] + dp[i - 2]) % MOD
    
    return dp[n]