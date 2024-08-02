import java.util.Stack;
class Solution {
    public int[] solution(int[] numbers) {
         int n = numbers.length;
        int[] result = new int[n]; // 결과 배열
        Stack<Integer> stack = new Stack<>(); // 인덱스를 저장할 스택

        // 결과 배열을 -1로 초기화
        for (int i = 0; i < n; i++) {
            result[i] = -1;
        }

        for (int i = 0; i < n; i++) {
            // 스택이 비어있지 않고 현재 숫자가 스택의 맨 위 숫자보다 큰 경우
            while (!stack.isEmpty() && numbers[i] > numbers[stack.peek()]) {
                // 스택에서 인덱스를 꺼내고, 해당 인덱스의 결과를 현재 숫자로 설정
                int index = stack.pop();
                result[index] = numbers[i];
            }
            // 현재 인덱스를 스택에 추가
            stack.push(i);
        }

        return result;
    }
}