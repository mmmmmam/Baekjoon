import java.util.Arrays;

class Solution {
    public int solution(int[] array, int height) {
        int cnt = 0;
		
		Arrays.sort(array);
		
		//System.out.println(Arrays.toString(array));
		
		for(int i=0;i<array.length;i++) {
			if(array[i] > height) {
				cnt++;
			}
		}
		//System.out.println(cnt);
		return cnt;
    }
}