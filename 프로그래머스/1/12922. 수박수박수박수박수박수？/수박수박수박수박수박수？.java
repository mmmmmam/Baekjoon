class Solution {
    public String solution(int n) {
        String answer = "";
        String watermelon = "수박";
        
        if(n%2 == 0) {
        	for(int i = 0; i<n/2 ;i++) {
        		answer += watermelon;
        	}
        }
        else {
        	for(int j = 0; j<n/2 ; j++) {
        		answer += watermelon;
        	}
        	answer += "수";
        }
        return answer;
    }
}