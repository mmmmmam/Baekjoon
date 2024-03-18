class Solution {
    public int solution(String s) {
        String[] starr = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        
        for(int i = 0; i<starr.length; i++) {
        	if(s.contains(starr[i])) {
        		s = s.replaceAll(starr[i], Integer.toString(i));
        	}
        }
        
        return Integer.parseInt(s);
    }
}