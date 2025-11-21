import java.util.Scanner;

public class HexToBinary {
    public static void main(String[] args) {
        while (true) {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter the Hexadecimal character to convert to Binary: ");
            String hexInput = input.nextLine();

            char ch = Character.toUpperCase(hexInput.charAt(0));

            int value = 0;

            if ('A' <= ch && ch <= 'F') {
                value = ch - 'A' + 10;
            } 
            else if (Character.isDigit(ch)) {
                value = ch - '0';
            } 
            else {
                System.out.println("Invalid input!");
                return;
            }

            System.out.println("Binary value: " + Integer.toBinaryString(value));
        }
    }
}
