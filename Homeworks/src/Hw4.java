import java.util.Scanner;

public class Hw4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("sayı gir:");
        int number1=scanner.nextInt();
        if(number1%2==0){
            System.out.println(number1 + " sayınız çift");
        }else{
            System.out.println(number1 + " sayınız tek");
        }

    }
}