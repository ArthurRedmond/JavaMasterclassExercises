import java.util.ArrayList;

public class NumberToWords {

    public static void numberToWords(int number) {
        if(number < 0) {
            System.out.println("Invalid Value");
        }
        int digitCount = getDigitCount(number);
        int reverse = reverse(number);
        int reverseDigitCount = getDigitCount(reverse);
        for(int i = 0; i < digitCount; i++) {
            int printDigit = reverse % 10;
            reverse = reverse / 10;
            switch (printDigit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
            }

    }

    public static int reverse(int number) {
        int absNumber = Math.abs(number);
        int returnInt = 0;
        int lastDigit;
        while(absNumber > 0) {
            lastDigit = absNumber % 10;
            returnInt = (returnInt * 10) + lastDigit;
            absNumber = absNumber / 10;
        }
        if(number < 0) {
            returnInt *= -1;
        }
        return returnInt;
    }

    public static int getDigitCount(int number) {
        if(number < 0) {
            return -1;
        }
        return String.valueOf(number).length();
    }
}
