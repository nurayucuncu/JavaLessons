import java.util.Scanner;

public class Hw2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1, number2;
        System.out.println("birinci sayıyı gir:");
        number1 = scanner.nextInt();
        System.out.println("ikinci sayıyı gir:");
        number2 = scanner.nextInt();

        if (number1 == number2) {
            System.out.println("number1 ve number2 aynıdır.");
        }
        if (number1 > number2) {
            System.out.println("number2 daha küçüktür.");
        }
        if (number1 < number2) {
            System.out.println("number1 daha küçüktür.");
        }
    }
}
