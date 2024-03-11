class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for(int a = left; a <= right; a++) {
        	int cnt = 0;
        	
	        for(int i = 1; i<=a; i++) {
	        	if(a%i == 0) {
	        		cnt++;
	        	}
	        }
	        
	        if(cnt%2 == 0) {
	        	answer += a;
	        }
	        else {
	        	answer -= a;
	        }
        }
        
        return answer;
    }
}