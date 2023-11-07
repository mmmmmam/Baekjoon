import java.util.Arrays;
class Solution {
    public long solution(long n) {
        String[] sarr = Long.toString(n).split("");
        String str = "";
        
        Arrays.sort(sarr);
        
        for(int i = sarr.length-1; i>=0; i--) {
        	str += sarr[i];
        }
        
        //System.out.println(Arrays.toString(sarr));
        //System.out.println(str);
        
        long answer = Long.parseLong(str);
        
        return answer;
    }
}