public class SharedDigit {

    public static boolean hasSharedDigit(int num1, int num2) {
        if(num1 > 9 && num1 < 100 && num2 > 9 && num2 < 100) {
            int num1b = num1 % 10;
            int num1a = num1 / 10;
            int num2b = num2 % 10;
            int num2a = num2 / 10;
            if((num1a == num2a || num1a == num2b) || (num1b == num2a || num1b == num2b)) {
                return true;
            }
        }
        return false;
    }
}
