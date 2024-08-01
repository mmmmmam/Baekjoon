import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static String[] solution(String[] players, String[] callings) {
        Map<String, Integer> playerPosition = new HashMap<>();

        // 선수들의 초기 위치를 맵에 저장
        for (int i = 0; i < players.length; i++) {
            playerPosition.put(players[i], i);
        }

        // 호출된 이름들에 따라 순위를 업데이트
        for (String calling : callings) {
            int currentPosition = playerPosition.get(calling);
            if (currentPosition > 0) { // 1등인 선수는 호출되지 않으므로 체크 불필요
                String prevPlayer = players[currentPosition - 1];

                // 순위 변경
                players[currentPosition] = prevPlayer;
                players[currentPosition - 1] = calling;

                // 맵 업데이트
                playerPosition.put(calling, currentPosition - 1);
                playerPosition.put(prevPlayer, currentPosition);
            }
        }

        return players;
    }
}