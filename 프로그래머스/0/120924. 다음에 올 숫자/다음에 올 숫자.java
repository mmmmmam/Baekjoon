class Solution {
    public int solution(int[] common) {
        // 등차수열 판별
        int difference = common[1] - common[0];
        boolean isArithmetic = true;
        
        for (int i = 2; i < common.length; i++) {
            if (common[i] - common[i - 1] != difference) {
                isArithmetic = false;
                break;
            }
        }
        
        if (isArithmetic) {
            // 등차수열인 경우, 마지막 원소에 공차를 더합니다.
            return common[common.length - 1] + difference;
        }
        
        // 등비수열 판별
        int ratio = common[1] / common[0];
        boolean isGeometric = true;
        
        for (int i = 2; i < common.length; i++) {
            if (common[i] / common[i - 1] != ratio || common[i] % common[i - 1] != 0) {
                isGeometric = false;
                break;
            }
        }
        
        if (isGeometric) {
            // 등비수열인 경우, 마지막 원소에 공비를 곱합니다.
            return common[common.length - 1] * ratio;
        }
        
        // 만약 어떤 수열에도 맞지 않는다면 (문제에서 이런 경우는 없다고 했지만)
        return -1; // 기본적으로 -1을 반환합니다.
    }
}