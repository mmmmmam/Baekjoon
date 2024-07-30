class Solution {
    public String solution(String X, String Y) {
       // 숫자 빈도 수를 저장할 맵을 생성합니다.
        int[] countX = new int[10];
        int[] countY = new int[10];
        
        // X와 Y를 문자열로 변환합니다.
        String xStr = String.valueOf(X);
        String yStr = String.valueOf(Y);
        
        // X와 Y의 빈도 수를 기록합니다.
        for (char c : xStr.toCharArray()) {
            countX[c - '0']++;
        }
        for (char c : yStr.toCharArray()) {
            countY[c - '0']++;
        }
        
        // 공통 숫자와 그 빈도 수를 계산합니다.
        int[] commonCount = new int[10];
        for (int i = 0; i < 10; i++) {
            commonCount[i] = Math.min(countX[i], countY[i]);
        }
        
        // 공통 숫자를 사용하여 가장 큰 정수를 만듭니다.
        StringBuilder result = new StringBuilder();
        for (int i = 9; i >= 0; i--) {
            while (commonCount[i] > 0) {
                result.append(i);
                commonCount[i]--;
            }
        }
        
        // 결과를 확인합니다.
        String resultStr = result.toString();
        if (resultStr.isEmpty()) {
            return "-1";
        } else if (resultStr.charAt(0) == '0') {
            return "0";
        } else {
            return resultStr;
        }
    }
}