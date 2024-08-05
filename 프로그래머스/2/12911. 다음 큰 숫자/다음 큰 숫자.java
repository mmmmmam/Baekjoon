class Solution {
    public int solution(int n) {
        int countOnes = Integer.bitCount(n);  // n의 1의 개수 계산
        int nextNumber = n + 1;  // n보다 큰 수를 찾기 위해 n+1부터 시작

        // n보다 큰 수 중 1의 개수가 같은 가장 작은 수를 찾기
        while (Integer.bitCount(nextNumber) != countOnes) {
            nextNumber++;
        }

        return nextNumber;
    }
}