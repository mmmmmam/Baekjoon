import java.util.Stack;
class Solution {
    public int solution(String s) {
        int n = s.length();
        int validCount = 0;

        for (int i = 0; i < n; i++) {
            String rotatedString = s.substring(i) + s.substring(0, i);
            if (isValidParenthesis(rotatedString)) {
                validCount++;
            }
        }

        return validCount;
    }
    private boolean isValidParenthesis(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            switch (c) {
                case '(': case '[': case '{':
                    stack.push(c);
                    break;
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(') {
                        return false;
                    }
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[') {
                        return false;
                    }
                    break;
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{') {
                        return false;
                    }
                    break;
                default:
                    // Invalid character
                    return false;
            }
        }

        return stack.isEmpty();
    }
}