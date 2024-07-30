class Solution {
    public String solution(String my_string, String alp) {
        // alp를 대문자로 변환
        String upperAlp = alp.toUpperCase();
        
        // my_string에서 alp를 upperAlp로 대체
        String resultString = my_string.replace(alp, upperAlp);
        
        return resultString;
    }
}