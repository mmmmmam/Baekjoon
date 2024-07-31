class Solution {
    public boolean solution(int x) {
        // x의 자릿수 합을 계산
        int sumOfDigits = getSumOfDigits(x);

        // x가 그 자릿수 합으로 나누어지는지 확인
        return x % sumOfDigits == 0;
    }
    
    public int getSumOfDigits(int number) {
        int sum = 0;

        // number의 각 자릿수를 더하기
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }
}