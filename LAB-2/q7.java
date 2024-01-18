import java.util.Scanner;

public class q7{

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter number: ");
    int decimalNumber = scanner.nextInt();

    System.out.println("Hexa-Decimal number is"+" "+ decimalToHexadecimal(decimalNumber));
  }

  public static String decimalToHexadecimal(int decimalNumber) {
    if (decimalNumber == 0) {
      return "0";
    }

    int remainder = decimalNumber % 16;
    char hexadecimalCharacter = "0123456789ABCDEF".charAt(remainder);
    return decimalToHexadecimal(decimalNumber / 16) + hexadecimalCharacter;
  }
}