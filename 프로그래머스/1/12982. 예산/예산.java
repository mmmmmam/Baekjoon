import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        Arrays.sort(d);
        
        for(int i = 0; i<d.length; i++) {
        	sum += d[i];
        	if(sum <= budget) {
        		list.add(d[i]);
        		
        	}
        }
        
        answer = list.size();
        
        return answer;
    }
}