import java.util.Arrays;
    
class Solution {
    public int solution(int[] array) {
        int result = 0;
        
        Arrays.sort(array);
        result = array[array.length/2];
        
        return result;
    }
}