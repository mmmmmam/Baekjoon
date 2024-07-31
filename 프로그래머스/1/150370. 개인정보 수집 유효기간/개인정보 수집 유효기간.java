import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        LocalDate todayDate = LocalDate.parse(today, formatter);

        // 약관 종류와 유효기간을 저장하는 Map
        Map<Character, Integer> termsMap = new HashMap<>();
        for (String term : terms) {
            String[] parts = term.split(" ");
            char type = parts[0].charAt(0);
            int months = Integer.parseInt(parts[1]);
            termsMap.put(type, months);
        }

        List<Integer> expired = new ArrayList<>();
        for (int i = 0; i < privacies.length; i++) {
            String[] parts = privacies[i].split(" ");
            LocalDate collectionDate = LocalDate.parse(parts[0], formatter);
            char type = parts[1].charAt(0);

            // 유효기간 계산
            LocalDate expiryDate = collectionDate.plusMonths(termsMap.get(type));
            if (!expiryDate.isAfter(todayDate)) {
                expired.add(i + 1);
            }
        }

        // List<Integer>를 int[]로 변환
        int[] result = new int[expired.size()];
        for (int i = 0; i < expired.size(); i++) {
            result[i] = expired.get(i);
        }

        // 결과를 오름차순으로 정렬하여 반환
        Arrays.sort(result);
        return result;
    }
}