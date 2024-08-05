import java.util.*;
class Solution {
    public int[] solution(int[] fees, String[] records) {
        Map<String, Integer> timeMap = new HashMap<>();
        Map<String, String> entryMap = new HashMap<>();
        final int baseTime = fees[0];
        final int baseFee = fees[1];
        final int unitTime = fees[2];
        final int unitFee = fees[3];
        final int lastTime = 1439; // 23:59 in minutes

        for (String record : records) {
            String[] parts = record.split(" ");
            String timeStr = parts[0];
            String carNumber = parts[1];
            String status = parts[2];

            int minutes = getMinutes(timeStr);
            if (status.equals("IN")) {
                entryMap.put(carNumber, timeStr);
            } else { // OUT
                int entryTime = getMinutes(entryMap.remove(carNumber));
                int parkedTime = minutes - entryTime;
                timeMap.put(carNumber, timeMap.getOrDefault(carNumber, 0) + parkedTime);
            }
        }

        // Handle cars that did not exit
        for (Map.Entry<String, String> entry : entryMap.entrySet()) {
            String carNumber = entry.getKey();
            int entryTime = getMinutes(entry.getValue());
            int parkedTime = lastTime - entryTime;
            timeMap.put(carNumber, timeMap.getOrDefault(carNumber, 0) + parkedTime);
        }

        // Calculate fees
        List<String> sortedCars = new ArrayList<>(timeMap.keySet());
        Collections.sort(sortedCars);
        int[] result = new int[sortedCars.size()];
        int index = 0;

        for (String carNumber : sortedCars) {
            int totalMinutes = timeMap.get(carNumber);
            int fee = baseFee;
            if (totalMinutes > baseTime) {
                int extraMinutes = totalMinutes - baseTime;
                int extraUnits = (int) Math.ceil((double) extraMinutes / unitTime);
                fee += extraUnits * unitFee;
            }
            result[index++] = fee;
        }

        return result;
    }
    private static int getMinutes(String timeStr) {
        String[] parts = timeStr.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        return hours * 60 + minutes;
    }
}