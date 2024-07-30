import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();

        // 참가자 목록을 해시맵에 저장
        for (String name : participant) {
            map.put(name, map.getOrDefault(name, 0) + 1);
        }

        // 완주자 목록에서 이름을 제거 (완주자 수를 감소)
        for (String name : completion) {
            if (map.containsKey(name)) {
                map.put(name, map.get(name) - 1);
            }
        }

        // 해시맵에서 완주하지 못한 참가자를 찾음
        for (String name : map.keySet()) {
            if (map.get(name) > 0) {
                return name;
            }
        }

        // 모든 참가자가 완주한 경우가 없으므로, 여기에 도달하면 안 됨
        return "";
    }
}