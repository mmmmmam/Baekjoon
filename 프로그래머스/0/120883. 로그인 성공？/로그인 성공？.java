import java.util.HashMap;
import java.util.Map;
class Solution {
    public String solution(String[] id_pw, String[][] db) {
        // 데이터베이스를 HashMap에 저장합니다.
        Map<String, String> userMap = new HashMap<>();
        
        // 데이터베이스를 순회하면서 아이디와 비밀번호를 HashMap에 저장합니다.
        for (String[] user : db) {
            String id = user[0];
            String pw = user[1];
            userMap.put(id, pw);
        }
        
        // 입력된 아이디와 비밀번호를 변수에 저장합니다.
        String inputId = id_pw[0];
        String inputPw = id_pw[1];
        
        // HashMap에서 아이디를 조회합니다.
        if (userMap.containsKey(inputId)) {
            // 아이디가 존재하는 경우, 비밀번호를 확인합니다.
            if (userMap.get(inputId).equals(inputPw)) {
                // 비밀번호가 일치하는 경우
                return "login";
            } else {
                // 비밀번호가 틀린 경우
                return "wrong pw";
            }
        }
        
        // 아이디가 존재하지 않는 경우
        return "fail";
    }
}