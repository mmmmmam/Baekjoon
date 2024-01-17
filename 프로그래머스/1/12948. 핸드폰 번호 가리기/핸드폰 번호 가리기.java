class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int n = phone_number.length() - 4;
        String[] arr = phone_number.split("");
        
        for(int i = 0; i<n; i++) {
        	arr[i] = "*";
        }
        
        for(int j = 0; j<arr.length; j++) {
        	answer += arr[j];
        }
        //System.out.println(n);
        //System.out.println(Arrays.toString(arr));
        return answer;
    }
}