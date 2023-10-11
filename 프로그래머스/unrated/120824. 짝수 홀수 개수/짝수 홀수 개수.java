class Solution {
    public int[] solution(int[] num_list) {
        int cntEven = 0; //짝수개수
		int cntOdd = 0; //홀수개수
		
		//System.out.println(num_list.length);
		
		for(int i=0; i < num_list.length; i++) {
		
			if(num_list[i]%2 == 0) {
				cntEven++; //짝수개수 증가
				//System.out.println(num_list[i]);
				
			}else {
				cntOdd++; //홀수개수 증가
			}
			
		}
		int[] answer = {cntEven,cntOdd}; //오오오오오오오! 소스는 위에서 아래로 흐른다. 
		return answer;
    }
}