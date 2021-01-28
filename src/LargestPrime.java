public class LargestPrime {
    public static int getLargestPrime(int number) {
        int largestPrime = -1;
        if(number < 2) {
            return -1;
        }
        while (number % 2 == 0) {
            largestPrime = 2;
            number >>= 1;
        }
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            while (number % i == 0) {
                largestPrime = i;
                number = number / i;
            }
        }
        if (number > 2)
            largestPrime = number;
        return largestPrime;
    }
}


