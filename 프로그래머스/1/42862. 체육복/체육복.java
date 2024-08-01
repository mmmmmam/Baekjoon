import java.util.Arrays;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        // 체육복을 도난당한 학생과 여벌의 체육복을 가진 학생을 정렬합니다.
        Arrays.sort(lost);
        Arrays.sort(reserve);

        // 도난당한 학생 배열에서 여벌의 체육복을 가진 학생을 제거합니다.
        int[] lostFiltered = Arrays.stream(lost)
                                   .filter(l -> !contains(reserve, l))
                                   .toArray();
        int[] reserveFiltered = Arrays.stream(reserve)
                                      .filter(r -> !contains(lost, r))
                                      .toArray();

        // 여벌의 체육복을 가진 학생이 체육복을 빌려줄 수 있는 학생들을 찾아서 처리합니다.
        for (int r : reserveFiltered) {
            // 현재 여벌 체육복을 가진 학생
            if (contains(lostFiltered, r - 1)) {
                lostFiltered = removeElement(lostFiltered, r - 1);
            } else if (contains(lostFiltered, r + 1)) {
                lostFiltered = removeElement(lostFiltered, r + 1);
            }
        }

        // 체육복을 도난당한 학생 수를 구하고, 전체 학생 수에서 이를 빼서 결과를 반환합니다.
        return n - lostFiltered.length;
    }

    // 배열에 특정 값이 포함되어 있는지 확인합니다.
    private boolean contains(int[] array, int value) {
        for (int i : array) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }
    
    // 배열에서 특정 값을 제거하고 새로운 배열을 반환합니다.
    private int[] removeElement(int[] array, int value) {
        return Arrays.stream(array)
                     .filter(i -> i != value)
                     .toArray();
    }
}