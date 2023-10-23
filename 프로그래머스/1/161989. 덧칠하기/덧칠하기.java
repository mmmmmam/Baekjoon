
import java.util.*;
class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        boolean[] paint = new boolean[n];
        
        Arrays.fill(paint, true);
        
        for(int i = 0; i<section.length; i++) {
        	paint[section[i]-1] = false;
        }
        
        int cnt = 0;
        
        for(int i = 0; i<paint.length; i++) {
        	if(i+m >= paint.length && !paint[i]) {
        		cnt++;
        		break;
        	}
        	if(!paint[i]) {
        		for(int j = i; j<i+m; j++) {
        			paint[j] = true;
        		}
        		i = i+m-1;
        		cnt++;
        	}
        }
        
        return cnt;
    }
}