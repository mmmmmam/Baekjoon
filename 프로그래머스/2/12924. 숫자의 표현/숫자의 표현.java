class Solution {
    public int solution(int n) {
        int count = 0;
        
        // m은 연속된 숫자의 개수
        for (int m = 1; m * (m + 1) / 2 <= n; m++) {
            // n을 m으로 나누었을 때 나머지가 0이면, k가 정수일 수 있음
            if ((2 * n - m * (m - 1)) % (2 * m) == 0) {
                count++;
            }
        }
        
        return count;
    }
}