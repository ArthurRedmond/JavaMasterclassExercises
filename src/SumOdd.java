public class SumOdd {

    public static boolean isOdd(int num) {
        if(num < 0) {
            return false;
        } else if(num % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        int begin = 0;
        if(start < 0 || end < 0) {
            return -1;
        } else if(start > end) {
            return -1;
        } else if(isOdd(start)){
            begin = start;
        } else {
            begin = start++;
        }
        for(int i = start; i <= end; i+=2){
            sum+=i;
        }
        return sum;
    }
}
