class Solution {
    public double solution(int[] numbers) {
        double result = 0;
		int sum = 0;
		
		for(int i:numbers) {
			sum += i;
		}
		result = (double)sum/numbers.length;
		
		return result;

    }
}