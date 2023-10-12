class Solution {
    public int[] solution(int[] num_list, int n) {
        int cnt = 0;
        
        for(int i =0; i<num_list.length;i++) {
        	if(i%n == 0) {
        		cnt++;
        	}
        }
        int[] arr = new int[cnt];
        int k = 0;
        for(int i=0;i<num_list.length;i++) {
        	if(i%n == 0) {
            	arr[k++] = num_list[i]; 
            }
        }
        		
        return arr;
    }
}