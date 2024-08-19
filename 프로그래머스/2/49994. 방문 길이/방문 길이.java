import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int solution(String dirs) {
        // 이동 방향을 정의합니다.
        int[][] directions = {
            {0, 1},   // U: 위쪽
            {0, -1},  // D: 아래쪽
            {1, 0},   // R: 오른쪽
            {-1, 0}   // L: 왼쪽
        };

        // 방문한 길을 추적하기 위한 List
        List<String> visited = new ArrayList<>();

        // 현재 위치 초기화
        int x = 0, y = 0;
        int length = 0;

        for (char command : dirs.toCharArray()) {
            int dir = 0;
            switch (command) {
                case 'U': dir = 0; break;
                case 'D': dir = 1; break;
                case 'R': dir = 2; break;
                case 'L': dir = 3; break;
            }

            // 다음 위치 계산
            int newX = x + directions[dir][0];
            int newY = y + directions[dir][1];

            // 경계 체크
            if (newX < -5 || newX > 5 || newY < -5 || newY > 5) {
                continue;
            }

            // 길을 문자열로 표현하여 방문 체크
            String path1 = x + "," + y + "->" + newX + "," + newY;
            String path2 = newX + "," + newY + "->" + x + "," + y;

            if (!visited.contains(path1) && !visited.contains(path2)) {
                length++;
                visited.add(path1);
                visited.add(path2);
            }

            // 현재 위치 갱신
            x = newX;
            y = newY;
        }

        return length;
    }
}