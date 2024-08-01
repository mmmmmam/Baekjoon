class Solution {
    public int solution(int[] numbers) {
        // 0부터 9까지의 숫자가 존재하는지 여부를 기록하는 배열
        boolean[] seen = new boolean[10];
        
        // 주어진 배열을 순회하면서 존재하는 숫자를 기록
        for (int number : numbers) {
            if (number >= 0 && number <= 9) {
                seen[number] = true;
            }
        }
        
        // 존재하지 않는 숫자를 찾아서 합산
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            if (!seen[i]) {
                sum += i;
            }
        }
        
        return sum;
    }
}