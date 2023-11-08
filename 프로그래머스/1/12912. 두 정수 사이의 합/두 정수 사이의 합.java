class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        if(a > b) {
        	for(int i = b; i <= a; i++) {
        		answer += i;
        	}
        	return answer;
        }else if(a < b) {
        	for(int j = a; j <= b; j++) {
        		answer += j;
        	}
        	return answer;
        }else {
        	return a;
        }
    }
}