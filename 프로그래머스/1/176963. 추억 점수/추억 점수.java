import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        // 사람 이름과 그리움 점수를 매핑하는 해시맵 생성
        Map<String, Integer> yearningMap = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            yearningMap.put(name[i], yearning[i]);
        }
        
        // 결과를 저장할 배열 생성
        int[] resultArray = new int[photo.length];
        
        // 각 사진에 대한 추억 점수 계산
        for (int i = 0; i < photo.length; i++) {
            int score = 0;
            for (String person : photo[i]) {
                // 해당 인물의 그리움 점수를 해시맵에서 가져와 합산
                if (yearningMap.containsKey(person)) {
                    score += yearningMap.get(person);
                }
            }
            resultArray[i] = score; // 배열에 결과 저장
        }
        
        return resultArray;
    }
}