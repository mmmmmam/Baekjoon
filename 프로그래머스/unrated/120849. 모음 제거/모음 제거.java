class Solution {
    public String solution(String my_string) {
        String str = "";
        
        for(int i = 0; i<my_string.length();i++) {
        	char ch = my_string.charAt(i);
        	
        	if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        		continue;
        	}else {
        		str += ch;
        	}
        }
		
		return str;
    }
}