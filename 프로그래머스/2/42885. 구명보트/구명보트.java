import java.util.Arrays;
class Solution {
    public int solution(int[] people, int limit) {
        // 배열을 오름차순으로 정렬합니다.
        Arrays.sort(people);

        int left = 0; // 가장 가벼운 사람의 인덱스
        int right = people.length - 1; // 가장 무거운 사람의 인덱스
        int boatCount = 0; // 필요한 구명보트의 개수

        while (left <= right) {
            if (people[left] + people[right] <= limit) {
                // 두 사람이 함께 구명보트에 탑승할 수 있는 경우
                left++;
            }
            // 가장 무거운 사람은 구명보트에 탑승시키고 인덱스 이동
            right--;
            // 구명보트 하나를 추가함
            boatCount++;
        }

        return boatCount;
    }
}