class Solution {
    public String solution(String s, String skip, int index) {
        // 결과를 저장할 StringBuilder 객체
        StringBuilder result = new StringBuilder();

        // 각 문자를 index 만큼 이동시키는 작업을 수행
        for (char c : s.toCharArray()) {
            char newChar = getNextChar(c, skip, index);
            result.append(newChar);
        }

        return result.toString();
    }

    private static char getNextChar(char c, String skip, int index) {
        int count = 0;
        char currentChar = c;

        // index 만큼 이동하되 skip에 포함된 문자들을 건너뜀
        while (count < index) {
            currentChar++;

            // 'z'를 넘어가면 'a'로 돌아옴
            if (currentChar > 'z') {
                currentChar = 'a';
            }

            // skip에 포함된 문자가 아니라면 count 증가
            if (skip.indexOf(currentChar) == -1) {
                count++;
            }
        }

        return currentChar;
    }
}