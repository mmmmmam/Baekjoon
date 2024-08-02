class Solution {
    public int[] solution(int num, int total) {
        // 연속된 수들의 합을 계산하기 위한 보정 값
        int adjustment = num * (num - 1) / 2;
        
        // 연속된 수들의 시작값 x 계산
        int start = (total - adjustment) / num;
        
        // 결과를 담을 배열 생성
        int[] result = new int[num];
        for (int i = 0; i < num; i++) {
            result[i] = start + i;
        }
        
        return result;
    }
}