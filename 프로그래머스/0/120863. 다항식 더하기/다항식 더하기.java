import java.util.HashMap;
import java.util.Map;

class Solution {
    public static String solution(String polynomial) {
        // 입력 다항식을 공백을 기준으로 나누어 배열에 저장
        String[] terms = polynomial.split(" ");
        
        // 변수와 상수의 계수를 저장할 맵
        Map<String, Integer> coefficients = new HashMap<>();
        
        // 항을 하나씩 처리
        for (String term : terms) {
            if (term.isEmpty()) continue;
            
            // 항의 계수를 파악하기 위한 변수
            int coefficient = 0;
            String variable = "";
            
            // 항이 'x'를 포함하는 경우
            if (term.contains("x")) {
                // 'x'를 기준으로 항을 분리
                String[] parts = term.split("x");
                
                // 'x' 앞의 부분이 숫자인지 확인
                if (parts.length > 0 && !parts[0].isEmpty()) {
                    String coeffPart = parts[0].trim();
                    if (coeffPart.equals("+")) {
                        coefficient = 1;
                    } else if (coeffPart.equals("-")) {
                        coefficient = -1;
                    } else {
                        try {
                            coefficient = Integer.parseInt(coeffPart);
                        } catch (NumberFormatException e) {
                            coefficient = 0; // 예외 발생 시 0으로 처리
                        }
                    }
                } else {
                    coefficient = 1; // "x" 또는 "+x"의 경우
                }
                variable = "x";
            } else {
                // 항이 상수항인 경우
                try {
                    coefficient = Integer.parseInt(term);
                } catch (NumberFormatException e) {
                    coefficient = 0; // 예외 발생 시 0으로 처리
                }
            }
            
            // 변수를 기반으로 맵에 계수 누적
            if (variable.isEmpty()) {
                coefficients.put("constant", coefficients.getOrDefault("constant", 0) + coefficient);
            } else {
                coefficients.put(variable, coefficients.getOrDefault(variable, 0) + coefficient);
            }
        }
        
        // 결과 문자열 생성
        StringBuilder result = new StringBuilder();
        if (coefficients.containsKey("x")) {
            int xCoeff = coefficients.get("x");
            if (xCoeff == 1) {
                result.append("x");
            } else if (xCoeff == -1) {
                result.append("-x");
            } else if (xCoeff != 0) {
                result.append(xCoeff).append("x");
            }
        }
        if (coefficients.containsKey("constant")) {
            int constant = coefficients.get("constant");
            if (constant != 0) {
                if (result.length() > 0) {
                    result.append(" + ");
                }
                result.append(constant);
            }
        }
        return result.length() == 0 ? "0" : result.toString();
    }
}