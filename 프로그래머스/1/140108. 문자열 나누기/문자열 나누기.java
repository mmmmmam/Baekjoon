class Solution {
    public int solution(String s) {
        int count = 0; // 분리된 문자열의 개수
        int xCount = 0; // 첫 번째 문자의 등장 횟수
        int otherCount = 0; // 다른 문자의 등장 횟수

        for (int i = 0; i < s.length(); i++) {
            // 첫 번째 문자 설정 및 비교
            if (i == 0 || s.charAt(i) == s.charAt(i - xCount - otherCount)) {
                xCount++; // 첫 번째 문자와 같으면 xCount 증가
            } else {
                otherCount++; // 첫 번째 문자와 다르면 otherCount 증가
            }

            // 두 카운터가 같아지면 문자열 분리
            if (xCount == otherCount) {
                count++; // 분리된 문자열 개수 증가
                xCount = 0; // 카운터 초기화
                otherCount = 0;
            }
        }

        // 남아 있는 문자열 처리
        if (xCount > 0 || otherCount > 0) {
            count++;
        }

        return count;
    }
}