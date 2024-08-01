import java.util.Stack;
class Solution {
    boolean solution(String s) {
        // 스택을 초기화합니다.
        Stack<Character> stack = new Stack<>();

        // 문자열의 각 문자를 순회합니다.
        for (char c : s.toCharArray()) {
            // 현재 문자가 '('인 경우 스택에 추가합니다.
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                // 현재 문자가 ')'인 경우
                // 스택이 비어있으면 잘못된 괄호입니다.
                if (stack.isEmpty()) {
                    return false;
                }
                // 스택이 비어있지 않으면 '('와 짝지어 제거합니다.
                stack.pop();
            }
        }

        // 순회가 끝난 후 스택이 비어있으면 모든 괄호가 올바르게 짝지어진 것입니다.
        return stack.isEmpty();
    }
}