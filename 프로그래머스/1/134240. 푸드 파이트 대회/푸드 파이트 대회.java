class Solution {
    public String solution(int[] food) {
        StringBuilder left = new StringBuilder();
        StringBuilder right = new StringBuilder();
        
        for (int i = 1; i < food.length; i++) {
            int count = food[i] / 2;
            
            for (int j = 0; j < count; j++) {
                left.append(i);
            }
            for (int j = 0; j < count; j++) {
                right.append(i);
            }
        }
        
        StringBuilder result = new StringBuilder();
        result.append(left).append(0).append(right.reverse());
        
        return result.toString();
    }
}