import java.util.Arrays;
import java.util.HashMap;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        
        for(int i=0; i<s.length(); i++) {
        	Character ch = s.charAt(i);
        	
        	if(!map.containsKey(ch)){
        		answer[i] = -1;
        		map.put(ch, i);
        	}else{
        		answer[i] = i - map.get(ch);
        		map.put(ch, i);
        	}

        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}