import java.util.Stack;
class Solution {
    public int solution(int[] ingredient) {
        // 스택을 사용하여 재료를 쌓고 햄버거를 포장합니다.
        Stack<Integer> stack = new Stack<>();
        int burgerCount = 0;

        for (int i = 0; i < ingredient.length; i++) {
            stack.push(ingredient[i]);

            // 스택의 크기가 4보다 작으면 햄버거를 만들 수 없음
            if (stack.size() >= 4) {
                // 스택의 top 4개의 재료를 확인하여 햄버거 포장 여부를 결정합니다.
                if (stack.get(stack.size() - 1) == 1 &&
                    stack.get(stack.size() - 2) == 3 &&
                    stack.get(stack.size() - 3) == 2 &&
                    stack.get(stack.size() - 4) == 1) {

                    // 햄버거 포장이 완료되면 재료 4개를 스택에서 제거합니다.
                    stack.pop(); // 1
                    stack.pop(); // 3
                    stack.pop(); // 2
                    stack.pop(); // 1

                    burgerCount++; // 햄버거 개수 증가
                }
            }
        }

        return burgerCount;
    }
}