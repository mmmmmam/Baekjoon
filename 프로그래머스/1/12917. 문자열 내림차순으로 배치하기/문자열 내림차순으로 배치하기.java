import java.util.Arrays;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] starr = s.split("");
        
        Arrays.sort(starr);
        
        for(int i=starr.length-1;i>=0;i--) {
        	answer += starr[i];
        }
        
        return answer;
    }
}