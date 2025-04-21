package calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAddCalculator {
    public static int splitAndAdd(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }
        // java.util.regex 패키지의 Matcher, Pattern import
        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(text);
        if (m.find()) {
            String customDelimiter = m.group(1);
            String[] tokens= m.group(2).split(customDelimiter);
            // 덧셈 구현
            return getResult(tokens);
        }
        String[] split = text.split(",|:");
        return getResult(split);
    }

    private static int getResult(String[] split) {
        int result = 0;
        for (String s : split) {
            int i = Integer.parseInt(s);
            isMinus(i);
            result += i;
        }
        return result;
    }

    private static void isMinus(int i) {
        if (i < 0) throw new RuntimeException();
    }
}
