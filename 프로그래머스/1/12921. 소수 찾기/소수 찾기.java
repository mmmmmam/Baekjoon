class Solution {
    public int solution(int n) {
        if (n < 2) {
            return 0;
        }

        // n까지의 소수를 구하기 위해 길이 n+1의 배열을 생성하고 모두 true로 초기화
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        // 에라토스테네스의 체 알고리즘
        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                // p의 배수들을 false로 설정
                for (int multiple = p * p; multiple <= n; multiple += p) {
                    isPrime[multiple] = false;
                }
            }
        }

        // true인 값들의 개수를 세어 반환
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }

        return count;
    }
}