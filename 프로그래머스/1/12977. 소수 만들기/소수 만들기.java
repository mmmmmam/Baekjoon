class Solution {
    public int solution(int[] nums) {
        int count = 0;
        int n = nums.length;

        // 서로 다른 3개의 숫자를 선택하여 합을 계산하는 부분
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (isPrime(sum)) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
    
    // 주어진 숫자가 소수인지 확인하는 메소드
    private static boolean isPrime(int number) {
        if (number < 2) return false; // 2보다 작은 숫자는 소수가 아님
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false; // 나누어 떨어지면 소수가 아님
        }
        return true; // 소수임
    }
}