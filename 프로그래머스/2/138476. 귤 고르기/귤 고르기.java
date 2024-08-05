import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        // 1. 귤 크기별 빈도수 계산
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int size : tangerine) {
            frequencyMap.put(size, frequencyMap.getOrDefault(size, 0) + 1);
        }

        // 2. 빈도수를 내림차순으로 정렬
        List<Integer> frequencies = new ArrayList<>(frequencyMap.values());
        frequencies.sort((a, b) -> b - a);

        // 3. k개를 선택할 때 최소의 크기 종류 수 계산
        int count = 0;
        int types = 0;
        for (int frequency : frequencies) {
            count += frequency;
            types++;
            if (count >= k) {
                break;
            }
        }

        return types;
    }
}