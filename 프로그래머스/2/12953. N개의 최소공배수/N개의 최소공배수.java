import java.util.Arrays;
class Solution {
    public int solution(int[] arr) {
        int max = Arrays.stream(arr).max().orElse(1); // 배열의 최대값

        // max의 배수 중에서 모든 원소가 나누어 떨어지는 값을 찾음
        for (int multiple = max; ; multiple += max) {
            boolean divisible = true;
            for (int num : arr) {
                if (multiple % num != 0) {
                    divisible = false;
                    break;
                }
            }
            if (divisible) {
                return multiple;
            }
        }
    
    }
}