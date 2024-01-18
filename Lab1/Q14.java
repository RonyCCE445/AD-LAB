public class Q14 {
    public static void main(String[] args) {
        int decimalNumber = 255;
        String hexadecimal = decimalToHexadecimal(decimalNumber);
        System.out.println("Hexadecimal representation: " + hexadecimal);
    }

    public static String decimalToHexadecimal(int decimalNumber) {
        if (decimalNumber < 16) {
            return Integer.toHexString(decimalNumber);
        } else {
            int quotient = decimalNumber / 16;
            int remainder = decimalNumber % 16;
            return decimalToHexadecimal(quotient) + Integer.toHexString(remainder);
        }
    }
}
