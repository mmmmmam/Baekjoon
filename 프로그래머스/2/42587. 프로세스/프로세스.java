import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        Queue<int[]> queue = new LinkedList<>();

        // 큐에 모든 프로세스를 [우선순위, 초기 위치] 형태로 추가
        for (int i = 0; i < priorities.length; i++) {
            queue.add(new int[] {priorities[i], i});
        }

        int answer = 0;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            boolean hasHigherPriority = false;

            // 큐에 남아있는 프로세스 중 더 높은 우선순위가 있는지 확인
            for (int[] process : queue) {
                if (process[0] > current[0]) {
                    hasHigherPriority = true;
                    break;
                }
            }

            if (hasHigherPriority) {
                // 더 높은 우선순위가 있으면 현재 프로세스를 다시 큐에 추가
                queue.add(current);
            } else {
                // 현재 프로세스를 실행
                answer++;
                if (current[1] == location) {
                    return answer;
                }
            }
        }

        return -1; // 이론상 도달하지 않음
    }
}