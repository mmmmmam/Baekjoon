class Solution {
    public String solution(String my_string) {
        //String result = "";
		StringBuilder sb = new StringBuilder();
		
		sb.append(my_string);
		
		String result = sb.reverse().toString();
		
		//System.out.println(result);
		return result;
    }
}