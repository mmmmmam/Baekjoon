import java.util.LinkedList;
import java.util.Queue;
class Solution {
    public int solution(int x, int y, int n) {
        if (x == y) {
            return 0; // x와 y가 같은 경우, 0번의 연산으로 변환할 수 있음
        }
        
        // BFS를 위한 큐와 방문 배열
        Queue<int[]> queue = new LinkedList<>();
        boolean[] visited = new boolean[y + 1]; // 0부터 y까지 방문 여부 체크
        
        // 시작 노드 (x, 0번 연산)
        queue.add(new int[]{x, 0});
        visited[x] = true;
        
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int currentValue = current[0];
            int currentSteps = current[1];
            
            // 가능한 모든 연산을 수행
            int[] nextValues = {currentValue + n, currentValue * 2, currentValue * 3};
            
            for (int nextValue : nextValues) {
                if (nextValue == y) {
                    return currentSteps + 1; // y에 도달한 경우
                }
                
                if (nextValue <= y && !visited[nextValue]) {
                    visited[nextValue] = true;
                    queue.add(new int[]{nextValue, currentSteps + 1});
                }
            }
        }
        
        return -1; // y에 도달할 수 없는 경우
    }
}