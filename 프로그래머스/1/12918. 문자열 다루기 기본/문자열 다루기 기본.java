class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        
        if(s.length() == 4 || s.length() == 6) {
        	try {
        		int x = Integer.parseInt(s);
        		return answer = true;
        	}catch (Exception e) {
        		return answer = false;
			}
        }
        
        return answer;
    }
}