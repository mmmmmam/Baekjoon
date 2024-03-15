import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<Integer>();
        
        for(int i = 0; i<arr.length; i++) {
        	if(i == 0) {
        		stack.push(arr[0]);
        	}else if(stack.peek() != arr[i]){
        		stack.push(arr[i]);
        	}
        }
        
        int[] answer = new int[stack.size()];
        
        for(int j = stack.size()-1; j>=0; j--) {
        	answer[j] = stack.pop();
        }

        return answer;
    }
}