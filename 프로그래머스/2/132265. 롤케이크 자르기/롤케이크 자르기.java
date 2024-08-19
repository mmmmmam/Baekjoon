import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int solution(int[] topping) {
        int n = topping.length;
        
        // 두 배열을 생성하여 각 위치에서의 토핑 종류 수를 저장합니다.
        int[] leftCounts = new int[n];
        int[] rightCounts = new int[n];
        
        // 왼쪽에서부터 토핑 종류를 추적합니다.
        Set<Integer> leftTopping = new HashSet<>();
        for (int i = 0; i < n; i++) {
            leftTopping.add(topping[i]);
            leftCounts[i] = leftTopping.size();
        }
        
        // 오른쪽에서부터 토핑 종류를 추적합니다.
        Set<Integer> rightTopping = new HashSet<>();
        for (int i = n - 1; i >= 0; i--) {
            rightTopping.add(topping[i]);
            rightCounts[i] = rightTopping.size();
        }
        
        // 두 배열을 비교하여 공평하게 자를 수 있는 위치를 계산합니다.
        int count = 0;
        for (int i = 0; i < n - 1; i++) {  // 마지막 인덱스는 자를 수 없으므로 제외
            if (leftCounts[i] == rightCounts[i + 1]) {
                count++;
            }
        }
        
        return count;
    }
}