import java.util.Arrays;
class Solution {
    public int[] solution(int[] num_list, int n) {
        // 배열의 길이를 구합니다.
        int length = num_list.length;
        
        // n번째 이후의 원소들을 부분 배열로 복사합니다.
        int[] part1 = Arrays.copyOfRange(num_list, n, length);
        
        // n번째까지의 원소들을 부분 배열로 복사합니다.
        int[] part2 = Arrays.copyOfRange(num_list, 0, n);
        
        // 결과를 담을 배열을 생성합니다.
        int[] result = new int[length];
        
        // 부분 배열들을 결과 배열에 복사합니다.
        System.arraycopy(part1, 0, result, 0, part1.length);
        System.arraycopy(part2, 0, result, part1.length, part2.length);
        
        return result;
    }
}