class Solution {
    public int[] solution(String s) {
        int transformationCount = 0;  // 이진 변환 횟수
        int removedZeroCount = 0;  // 제거된 0의 개수

        while (!s.equals("1")) {
            int originalLength = s.length();  // 현재 문자열의 길이
            s = s.replace("0", "");  // 0 제거
            int removedZeroes = originalLength - s.length();  // 제거된 0의 개수
            removedZeroCount += removedZeroes;

            // 변환된 문자열의 길이를 이진법으로 표현
            int length = s.length();
            s = Integer.toBinaryString(length);

            transformationCount++;
        }

        return new int[] { transformationCount, removedZeroCount };
    }
}