public class RomanToInt {
    public static int romanToInt(String roman) {
        int result = 0;
        int prevValue = 0;
        for (int i = roman.length() - 1; i >= 0; i--) {
            int currentValue = getRomanValue(roman.charAt(i));
            if (currentValue < prevValue) {
                result -= currentValue;  // Subtraction rule
            } else {
                result += currentValue;  // Addition rule
            }
            prevValue = currentValue;
        }
        return result;
    }

    private static int getRomanValue(char romanChar) {
        switch (romanChar) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }

    public static void main(String[] args) {
        String roman = "IX";  // Example Roman numeral
        System.out.println("Roman " + roman + " is " + romanToInt(roman));
    }
}
