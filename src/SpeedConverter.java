public class SpeedConverter {

    public static long toMilesPerHour (double kilometersPerHour) {
        double number = 1.609;
        long roundedNumber = Math.round(kilometersPerHour / number);

        if (kilometersPerHour < 0) {
           return -1;
        } else {
            return roundedNumber;
        }
    }

    public static void printConversion(double kilometersPerHour) {
        int answer = Math.round(toMilesPerHour(kilometersPerHour));

        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + answer + " mi/h");
        }

    }


}
