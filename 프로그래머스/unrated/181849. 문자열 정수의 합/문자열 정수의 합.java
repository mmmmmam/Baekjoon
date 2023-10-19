class Solution {
    public int solution(String num_str) {
        int sum = 0;
        
        String[] a = num_str.split("");
        
        for(int i =0; i<a.length;i++) {
        	sum += Integer.parseInt(a[i]);
        }
        
        //System.out.println(sum);
        return sum;
    }
}