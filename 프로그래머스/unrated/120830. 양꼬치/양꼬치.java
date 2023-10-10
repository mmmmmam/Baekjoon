class Solution {
    public int solution(int n, int k) {
        int result = 0;
		int a = n*12000; //양꼬치가격
		
		if(n>=10) {
			int c = n/10; //서비스콜라개수
			k = k-c;
		}
		
		int b = k*2000; //서비스제외한 콜라가격
		
		result = a+b;
		return result;
    }
}