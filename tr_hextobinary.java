import java.util.Scanner;


public class hextobinary {
    public static void main(String[] args) {
        while (true) {
        Scanner input = new Scanner(System.in);

        System.out.println("Binary formatına çevirmek istediğiniz Hexadecimal ifadeyi giriniz: ");
        String x = input.nextLine();

        char ch = Character.toUpperCase(x.charAt(0));

        int value = 0;

        if ('A'<=ch && ch<='F') {
            value = ch - 'A' + 10;
        }
       
        else if (Character.isDigit(ch)) {
            value = ch - '0';
        }
        else {
            System.out.println("Geçersiz ifade!");
            return;
        }
    
        
        System.out.println(Integer.toBinaryString(value));


    }
}
}
