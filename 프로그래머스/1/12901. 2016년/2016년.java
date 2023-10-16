class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int sum = 0;
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        for(int i =0; i<a-1; i++) {
        	sum += month[i];
        }
        int day = ((sum+b)%7)-1;
        //System.out.println(sum);
        //System.out.println(day);
        if(day == 0) {
        	answer = "FRI";
        }else if(day == 1) {
        	answer = "SAT";
        }else if(day == 2) {
        	answer = "SUN";
        }else if(day == 3) {
        	answer = "MON";
        }else if(day == 4) {
        	answer = "TUE";
        }else if(day == 5) {
        	answer = "WED";
        }else if(day == -1) {
        	answer = "THU";
        }
        
        return answer;
    }
}