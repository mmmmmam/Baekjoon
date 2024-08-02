import java.util.PriorityQueue;
class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        // 초기 스코빌 지수를 우선순위 큐에 추가
        for (int s : scoville) {
            minHeap.add(s);
        }
        
        int mixCount = 0;
        
        while (minHeap.size() > 1 && minHeap.peek() < K) {
            // 가장 낮은 두 스코빌 지수를 추출
            int first = minHeap.poll();
            int second = minHeap.poll();
            
            // 새로운 음식의 스코빌 지수 계산
            int newScoville = first + (second * 2);
            
            // 새로운 음식의 스코빌 지수를 큐에 추가
            minHeap.add(newScoville);
            
            // 섞은 횟수 증가
            mixCount++;
        }
        
        // 모든 음식이 K 이상의 스코빌 지수를 가지지 못하는 경우
        if (minHeap.peek() < K) {
            return -1;
        }
        
        return mixCount;
    }
}