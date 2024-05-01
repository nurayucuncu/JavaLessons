import java.util.Scanner;

public class Hw1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1;
        System.out.println("birinci sayıyı giriniz:");
        number1 = scanner.nextInt();
        if (number1 == 0) {
            System.out.println("birinci sayıyı giriniz:");
            number1 = scanner.nextInt();
        }
        if (number1 < 0) {
            System.out.println("girilen sayi negatiftir.");
            System.exit(-1);
        }
        if (number1 > 0) {
            System.out.println("girilen sayi pozitiftir.");
        }


    }
}