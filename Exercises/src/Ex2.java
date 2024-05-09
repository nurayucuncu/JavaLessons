import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int sayı;
        int sum = 0;

        while(true) {
            System.out.println("bir sayı giriniz:");
            sayı = scanner.nextInt();
            if (sayı == 0) {
                break;
            }
            sum=sum+sayı;
        }

        System.out.println(sum);
    }
}
