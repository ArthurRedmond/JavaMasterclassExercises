public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if(barking) {
            if(hourOfDay >= 0 && hourOfDay <= 23) {
                if(hourOfDay > 22 || hourOfDay < 8) {
                    return true;
                }
            }
        }
        return false;
    }
}
