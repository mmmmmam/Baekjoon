import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Solution {
    
    public static int solution(int k, int[][] dungeons) {
        // 던전 수
        int n = dungeons.length;
        // 던전의 순열을 저장할 리스트
        List<List<Integer>> permutations = new ArrayList<>();
        // 던전의 인덱스 리스트
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            indices.add(i);
        }
        // 모든 순열 생성
        generatePermutations(indices, 0, permutations);

        int maxDungeons = 0;

        // 모든 순열에 대해 최대 탐험 던전 수 계산
        for (List<Integer> perm : permutations) {
            int currentFever = k;
            int count = 0;
            for (int index : perm) {
                int minFever = dungeons[index][0];
                int costFever = dungeons[index][1];
                if (currentFever >= minFever) {
                    currentFever -= costFever;
                    count++;
                } else {
                    break;
                }
            }
            maxDungeons = Math.max(maxDungeons, count);
        }

        return maxDungeons;
    }

    // 순열 생성 메소드
    private static void generatePermutations(List<Integer> list, int start, List<List<Integer>> result) {
        if (start == list.size() - 1) {
            result.add(new ArrayList<>(list));
        } else {
            for (int i = start; i < list.size(); i++) {
                Collections.swap(list, start, i);
                generatePermutations(list, start + 1, result);
                Collections.swap(list, start, i); // backtrack
            }
        }
    }
}