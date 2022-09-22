public class JavaFloatLiterals {
    public static void main(String[] args) {
        double piDoubleValue = 3.1415926535;
        float piFloatValue = 3.1415926535F;
        double piScientific = 3.1415926535e0;

        System.out.println("Pi to ten decimal places: " + piDoubleValue);
        System.out.println("A rounded value of Pi: " + piFloatValue);
        System.out.println("Pi from a scientific notation: " + piScientific);
    }
}
