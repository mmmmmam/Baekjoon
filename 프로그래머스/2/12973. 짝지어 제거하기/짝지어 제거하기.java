import java.util.Stack;
class Solution
{
    public int solution(String s)
    {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            // 스택의 최상단 문자와 현재 문자가 같으면 제거
            if (!stack.isEmpty() && stack.peek() == currentChar) {
                stack.pop();
            } else {
                // 스택이 비어있거나 최상단 문자와 다르면 현재 문자를 스택에 추가
                stack.push(currentChar);
            }
        }

        // 스택이 비어 있으면 모든 쌍이 제거된 것
        return stack.isEmpty() ? 1 : 0;
    }
}