public class ThreeAndFive {
    public static void threeAndFive(int begin, int end) {
        if(begin < end) {
            if((begin > 0 && begin <= 1000) && (end > 0 && end <= 1000)) {
                int tally = 0;
                int count = 0;
                for(int i = begin; i <= end; i++) {
                    if(i % 3 == 0 && i % 5 == 0) {
                        System.out.println(i);
                        tally += i;
                        count++;
                        if(count == 5){
                            break;
                        }
                    }
                }
                System.out.println("Tally = " + tally);
            }
        }
    }
}
