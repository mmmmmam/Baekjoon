class Solution {
    public int solution(String my_string) {
        int sum = 0;
        
        my_string = my_string.replaceAll("[a-zA-Z]", "");
        String[] arr = my_string.split("");
        
        for(int i = 0; i<arr.length;i++) {
        	sum += Integer.parseInt(arr[i]);
        }
        return sum;
    }
}