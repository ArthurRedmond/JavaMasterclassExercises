public class CalcFeetAndInchesToCentimeters {

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if(feet >= 0 && (inches >=0 && inches <= 12)) {
            double total = inches + (feet * 12);
            total *= 2.54;
            if(feet != 1) {
                System.out.println(feet + " feet, " + inches + " inches = " + total + " cm");
            } else {
                System.out.println(feet + " foot, " + inches + " inches = " + total + " cm");
            }
            return total;
        } else {
            System.out.println("Invalid parameters");
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        int feet = (int)inches / 12;
        double remainingInches = inches % 12;
        return calcFeetAndInchesToCentimeters((double) feet, remainingInches);
    }

}
