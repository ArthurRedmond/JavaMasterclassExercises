public class DigitSum {
    public static int sumDigit(int number) {
        int sum = 0;
        if(number < 10) {
            return -1;
        } else {
            while (number != 0) {
                sum += number % 10;
                number = number / 10;
            }
            return sum;
        }
    }
}
