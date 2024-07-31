class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        // 행렬의 행과 열의 크기를 확인
        int rows = arr1.length;
        int cols = arr1[0].length;
        
        // 결과를 저장할 행렬을 생성
        int[][] result = new int[rows][cols];
        
        // 각 위치에 있는 값을 더해 결과 행렬에 저장
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        
        return result;
    }
}