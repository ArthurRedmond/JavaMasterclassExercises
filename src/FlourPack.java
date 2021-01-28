public class FlourPack {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        int bigTotal = bigCount * 5;
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        if(bigTotal < goal) {
            if(bigTotal + smallCount >= goal) {
                return true;
            }
        } if (bigTotal >= goal) {
            int bigAble = goal / 5;
            if(((bigAble * 5) + smallCount) >= goal) {
                return true;
            }
        }
        return false;
    }
}
