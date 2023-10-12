import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        String romanNumeral = "XIII"; // Replace this with your Roman numeral input
        int result = romanToInteger(romanNumeral);
        System.out.println("The integer value of " + romanNumeral + " is " + result);
    }

    public static int romanToInteger(String s) {
        Map<Character, Integer> romanToInteger = new HashMap<>();
        romanToInteger.put('I', 1);
        romanToInteger.put('V', 5);
        romanToInteger.put('X', 10);
        romanToInteger.put('L', 50);
        romanToInteger.put('C', 100);
        romanToInteger.put('D', 500);
        romanToInteger.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int value = romanToInteger.get(s.charAt(i));

            if (value < prevValue) {
                result -= value;
            } else {
                result += value;
            }

            prevValue = value;
        }

        return result;
    }
}
