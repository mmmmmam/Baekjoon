class Solution {
    public int solution(int n) {
        int answer = n/7;
		if(n%7>0) {
			answer++;
		}
		//System.out.println(answer);
		return answer;
    }
}