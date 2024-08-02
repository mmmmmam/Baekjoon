import java.util.HashSet;
import java.util.Set;
class Solution {
    public boolean solution(String[] phone_book) {
        // HashSet을 사용하여 모든 전화번호를 저장합니다.
        Set<String> phoneSet = new HashSet<>();

        // 전화번호를 정렬합니다. 
        // 정렬을 통해 접두사 문제를 해결하기 더 용이해집니다.
        java.util.Arrays.sort(phone_book);

        // 전화번호를 순회하며 접두사 여부를 확인합니다.
        for (String phoneNumber : phone_book) {
            // 현재 전화번호가 이전 전화번호들의 접두사인지 확인합니다.
            for (int i = 1; i <= phoneNumber.length(); i++) {
                if (phoneSet.contains(phoneNumber.substring(0, i))) {
                    return false;
                }
            }
            // 전화번호를 HashSet에 추가합니다.
            phoneSet.add(phoneNumber);
        }

        return true;
    }
}