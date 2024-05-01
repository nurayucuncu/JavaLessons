import java.util.Scanner;

public class Hw6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("0-100 aralığında bir not giriniz:");
        int not=scanner.nextInt();
        int round = ((not / 5) +1) *5;

        if(not < 38) {
            System.out.println("başarısız not");

        }else {
            if (round - not < 3) {
                not = round;
            }
        }

        System.out.println("not : " + not);
    }
}
