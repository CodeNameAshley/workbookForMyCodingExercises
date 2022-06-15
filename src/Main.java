public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        SpeedConverter.printConversion(75.114);
        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
        System.out.println(BarkingDog.shouldWakeUp(true, 0));
        System.out.println(LeapYear.isLeapYear(1924));
        System.out.println(NumberInWord.printNumberInWord(9));
    }
}
