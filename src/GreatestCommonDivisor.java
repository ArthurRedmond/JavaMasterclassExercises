public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int num1, int num2) {
        if(num1 < 10 || num2 < 10) {
            return -1;
        }
        int a = 0;
        int b = 0;
        int r = 1;
        if(num1 > num2) {
            a = num1;
            b = num2;
        } else {
            a = num2;
            b = num1;
        }
        while (r > 0){
            r = a % b;
            a = b;
            if(r!=0) {
                b = r;
            }
        }
        return b;
    }
}
