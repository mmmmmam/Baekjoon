import java.util.*;
class Solution {
    public int solution(int[] order) {
        // 컨테이너 벨트와 보조 컨테이너 벨트 정의
        Queue<Integer> belt = new LinkedList<>();
        Stack<Integer> auxiliary = new Stack<>();
        
        // 컨테이너 벨트 초기화 (상자의 번호는 1부터 시작)
        for (int i = 1; i <= order.length; i++) {
            belt.add(i);
        }
        
        // 트럭에 실어야 하는 상자 순서
        int currentIndex = 0;
        
        // 상자를 실은 개수
        int count = 0;
        
        while (!belt.isEmpty() || !auxiliary.isEmpty()) {
            // 컨테이너 벨트의 앞 상자
            int topBelt = belt.isEmpty() ? -1 : belt.peek();
            // 보조 컨테이너 벨트의 상자
            int topAuxiliary = auxiliary.isEmpty() ? -1 : auxiliary.peek();
            // 트럭에 실어야 할 상자
            int target = order[currentIndex];
            
            if (topBelt == target) {
                // 컨테이너 벨트에서 상자를 꺼내어 트럭에 실음
                belt.poll();
                count++;
                currentIndex++;
            } else if (topAuxiliary == target) {
                // 보조 컨테이너 벨트에서 상자를 꺼내어 트럭에 실음
                auxiliary.pop();
                count++;
                currentIndex++;
            } else if (!belt.isEmpty()) {
                // 컨테이너 벨트에서 상자를 보조 컨테이너 벨트로 이동
                auxiliary.push(belt.poll());
            } else {
                // 더 이상 실을 수 없는 경우
                break;
            }
        }
        
        return count;
    }
}