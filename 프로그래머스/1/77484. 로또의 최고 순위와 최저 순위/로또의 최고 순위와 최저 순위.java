import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        // 당첨 번호를 Set으로 변환하여 빠른 검색을 지원합니다.
        Set<Integer> winSet = new HashSet<>();
        for (int num : win_nums) {
            winSet.add(num);
        }

        // 알아볼 수 없는 번호(0)의 개수를 세고, 맞춘 번호의 개수를 계산합니다.
        int zeroCount = 0;
        int matchCount = 0;
        for (int num : lottos) {
            if (num == 0) {
                zeroCount++;
            } else if (winSet.contains(num)) {
                matchCount++;
            }
        }

        // 최대 일치 수와 최소 일치 수를 계산합니다.
        int maxMatch = matchCount + zeroCount;  // 알아볼 수 없는 번호를 모두 맞출 수 있다고 가정
        int minMatch = matchCount;              // 알아볼 수 없는 번호를 모두 틀릴 수 있다고 가정

        // 순위를 계산합니다.
        int maxRank = getRank(maxMatch);
        int minRank = getRank(minMatch);

        return new int[]{maxRank, minRank};
    }
    // 맞춘 번호 수에 따라 순위를 반환합니다.
    private static int getRank(int matchCount) {
        if (matchCount == 6) return 1;
        if (matchCount == 5) return 2;
        if (matchCount == 4) return 3;
        if (matchCount == 3) return 4;
        if (matchCount == 2) return 5;
        return 6; // 1개 이하일 때는 6등
    }

}