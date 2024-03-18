class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long pp = Long.parseLong(p);
        int length = t.length() - p.length() + 1;
        
        for(int i = 0; i< length; i++) {
        	String temp = t.substring(i, i+p.length());
        	
        	if(Long.parseLong(temp) <= pp) {
        		answer++;
        	}
        }
        
        return answer;
    }
}