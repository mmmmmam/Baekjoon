class Solution {
    public long solution(long n) {
        long sqrt = (long)Math.sqrt(n);  // n의 제곱근을 계산
        
        // 제곱근의 제곱이 n과 같은지 확인
        if (sqrt * sqrt == n) {
            // (sqrt + 1)의 제곱을 반환
            return (sqrt + 1) * (sqrt + 1);
        } else {
            // 제곱수가 아니면 -1 반환
            return -1;
        }
    }
}