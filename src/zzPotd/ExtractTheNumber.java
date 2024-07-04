package zzPotd;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractTheNumber {

    public static void main(String[] args) {
        String sentence = "This is alpha 5057 and 97";
        ExtractNumber(sentence);
    }

    public static long ExtractNumber(String sentence) {
        long result = -1;
        Pattern pattern = Pattern.compile("\\b\\d+\\b");
        Matcher matcher = pattern.matcher(sentence);

        while (matcher.find()) {
            String number = matcher.group();
            if (!number.contains("9")) {
                result = Math.max(result, Long.parseLong(number));
            }
        }
        return result;
    }
}
