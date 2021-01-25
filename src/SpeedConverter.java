public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour) {
        if(kilometersPerHour >= 0) {
            return Math.round(kilometersPerHour / 1.609);
        }
        return -1;
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour >= 0) {
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h ");
        } else {
            System.out.printf("Invalid Value");
        }
    }

}
