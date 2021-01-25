public class LastDigitChecker {
    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if(isValid(num1) && isValid(num2) && isValid(num3)) {
            int num1Last = num1 % 10;
            int num2Last = num2 % 10;
            int num3Last = num3 % 10;
            if((num1Last == num2Last || num1Last == num3Last || num2Last == num3Last)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isValid(int number) {
        if(number > 9 && number <= 1000) {
            return true;
        }
        return false;
    }
}
