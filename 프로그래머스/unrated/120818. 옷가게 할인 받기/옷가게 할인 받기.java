class Solution {
    public int solution(int price) {
        int answer = 0;
		double pay = 0;
		
		if(price>=500000) {
			pay = price*0.8;
		}else if(price>=300000) {
			pay = price*0.9;
		}else if(price>=100000) {
			pay = price*0.95;
		}else {
			pay = price;
		}
		
		answer = (int)pay;
		
		return answer;
    }
}