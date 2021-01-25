public class SumFirstAndLastDigit {

    public static int sumFirstAndLastDigit(int number){
        if(number < 0) {
            return -1;
        }
        int firstDigit = 0;
        int lastDigit = number % 10;
        do{
            firstDigit = number % 10;
            number = number / 10;
        } while (number > 0);
        return (firstDigit + lastDigit);
    }
}
