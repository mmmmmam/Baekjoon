class Solution {
    boolean solution(String s) {
        boolean answer = true;
        char[] sarr = new char[s.length()];
        int pcnt = 0;
        int ycnt = 0;
        
        s = s.toUpperCase();
        
        for(int i = 0; i<sarr.length; i++) {
        	sarr[i] = s.charAt(i);
        	if(sarr[i] == 'P') {
        		pcnt++;
        	}else if(sarr[i] == 'Y') {
        		ycnt++;
        	}
        }
        if(pcnt != ycnt) {
        	answer = false;
        }

        return answer;
    }
}