import java.util.Arrays;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] starr = s.split("");
        int index = 0;
        
        for(int i = 0; i<starr.length; i++) {
        	if(starr[i].equals(" ")) {
        		index = 0;
        	}else if(index%2 != 0) {
        		starr[i] = starr[i].toLowerCase();
        		index++;
        	}else if(index%2 == 0) {
        		starr[i] = starr[i].toUpperCase();
        		index++;
        	}
        	answer += starr[i];
        }

        System.out.println(Arrays.toString(starr));
        return answer;
    }
}