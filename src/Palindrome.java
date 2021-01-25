public class Palindrome {

    public static boolean isPalindrome(int number) {
        int originalNum = Math.abs(number);
        int num = originalNum;
        int reverse = 0;

        while (num > 0){
            int lastDigit = num % 10;
            reverse = (reverse * 10) + lastDigit;
            num = num / 10;
        }

        if(originalNum == reverse) {
            return true;
        } else {
            return false;
        }
    }
}
