class Solution {
    public String solution(String s) {
        StringBuilder result = new StringBuilder();
        boolean newWord = true; // 첫 번째 글자부터 처리하기 위한 플래그

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                result.append(c);
                newWord = true; // 공백 뒤에는 새로운 단어가 올 것이므로 플래그를 true로 설정
            } else {
                if (newWord) {
                    result.append(Character.toUpperCase(c)); // 새로운 단어의 첫 글자를 대문자로
                    newWord = false; // 다음 문자는 단어의 일부이므로 플래그를 false로 설정
                } else {
                    result.append(Character.toLowerCase(c)); // 나머지 글자는 소문자로
                }
            }
        }
        
        return result.toString();
    }
}