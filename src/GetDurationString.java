public class GetDurationString {

    public static String getDurationString(int minutes, int seconds) {
        String returnString = "Invalid value";
        if((minutes >= 0) && ((seconds >= 0) && (seconds <= 59))) {
            int hours = minutes / 60;
            int remainingMinutes = minutes % 60;
            returnString = hours + "h " + remainingMinutes + "m " + seconds + "s";
        }
        return returnString;
    }
    public static String getDurationString(int seconds) {
        String returnString = "Invalid value";
        if(seconds >= 0) {
            int minutes = seconds / 60;
            int remainingSeconds = seconds % 60;
            return getDurationString(minutes, remainingSeconds);
        }
        return returnString;
    }

}
