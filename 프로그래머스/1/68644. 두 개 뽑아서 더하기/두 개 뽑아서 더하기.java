import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public int[] solution(int[] numbers) {
        HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i = 0; i<numbers.length; i++) {
			for(int j = i+1; j<numbers.length; j++) {
				int sum = numbers[i] + numbers[j];
				set.add(sum);
			}
		}
		
        int[] answer = new int[set.size()];
        int index = 0;
        
        for(int n:set) {
        	answer[index++] = n;
        }
        
        Arrays.sort(answer);
        
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}