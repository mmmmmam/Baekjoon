import java.util.Stack;
class Solution {
    public int[] solution(int[] prices) {
        int n = prices.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            // 가격이 떨어지지 않는 기간을 계산하기 위해 스택을 사용
            while (!stack.isEmpty() && prices[stack.peek()] > prices[i]) {
                int index = stack.pop();
                result[index] = i - index;
            }
            stack.push(i);
        }
        
        // 스택에 남아있는 인덱스들은 마지막까지 가격이 떨어지지 않았음
        while (!stack.isEmpty()) {
            int index = stack.pop();
            result[index] = n - index - 1;
        }
        
        return result;
    }
}