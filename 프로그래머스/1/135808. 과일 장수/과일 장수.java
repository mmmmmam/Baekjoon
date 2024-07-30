import java.util.Arrays;
class Solution {
    public int solution(int k, int m, int[] score) {
        // 사과 점수를 내림차순으로 정렬
        Arrays.sort(score);

        // 점수를 내림차순으로 정렬한 결과를 뒤집어줍니다.
        // Arrays.sort는 오름차순으로 정렬하므로, 역순으로 정렬하여 높은 점수부터 처리합니다.
        reverse(score);

        int totalProfit = 0;
        int numBoxes = score.length / m;

        // 상자를 만들어 최대 이익을 계산
        for (int i = 0; i < numBoxes; i++) {
            // 각 상자의 가격은 상자에 담긴 사과 중 가장 낮은 점수
            int boxPrice = score[i * m + (m - 1)];
            totalProfit += boxPrice * m;
        }

        return totalProfit;
    }
    
    // 배열을 역순으로 정렬하는 메서드
    private static void reverse(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }
}