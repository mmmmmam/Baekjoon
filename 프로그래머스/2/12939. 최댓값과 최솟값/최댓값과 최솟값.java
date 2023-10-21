import java.util.Arrays;
class Solution {
    public String solution(String s) {
            String answer = "";
	        String[] sarr = new String[s.length()];

	        //공백구분으로 배열에 넣기
	        sarr = s.split(" ");
	        
	        int[] narr = new int[sarr.length];
	        
	        for(int i = 0;i<sarr.length;i++) {
	        	narr[i] = Integer.parseInt(sarr[i]);
	        }
	        
	        Arrays.sort(narr);
	        
	        //System.out.println(Arrays.toString(sarr));
	        //System.out.println(Arrays.toString(narr));
	        
	        answer = narr[0] + " " + narr[narr.length-1] ;
	        
	        return answer;
    }
}