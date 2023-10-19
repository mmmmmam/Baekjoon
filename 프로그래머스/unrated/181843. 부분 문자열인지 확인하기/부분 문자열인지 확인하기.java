class Solution {
    public int solution(String my_string, String target) {
        int answer = 0;
        
        boolean a = my_string.contains(target);
        
        if(a==true) {
        	answer = 1;
        }
        return answer;
    }
}