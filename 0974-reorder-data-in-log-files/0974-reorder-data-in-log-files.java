import java.util.*;

class Solution {
    public String[] reorderLogFiles(String[] logs) {
        List<String> letterLogs = new ArrayList<>();
        List<String> digitLogs = new ArrayList<>();

        // Separate logs into digit-logs and letter-logs
        for (String log : logs) {
            String[] parts = log.split(" ", 2); // Split into identifier and content
            if (Character.isDigit(parts[1].charAt(0))) {
                digitLogs.add(log); // Digit-log
            } else {
                letterLogs.add(log); // Letter-log
            }
        }

        // Sort letter-logs
        Collections.sort(letterLogs, (log1, log2) -> {
            String[] parts1 = log1.split(" ", 2);
            String[] parts2 = log2.split(" ", 2);
            int cmp = parts1[1].compareTo(parts2[1]); // Compare content
            if (cmp == 0) {
                return parts1[0].compareTo(parts2[0]); // Compare identifiers if content matches
            }
            return cmp;
        });

        // Combine sorted letter-logs and digit-logs
        String[] result = new String[logs.length];
        int i = 0;
        for (String log : letterLogs) {
            result[i++] = log;
        }
        for (String log : digitLogs) {
            result[i++] = log;
        }
        return result;
    }
}