public class FlourPack {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if(bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        int bigTotal = bigCount * 5;
        int smallTotal = smallCount;
        if(bigTotal < goal) {
            if(goal - bigTotal > smallTotal) {
                return true;
            }
//        } else if(bigTotal > goal) {
//            if(goal / bigCount);
        }
}
