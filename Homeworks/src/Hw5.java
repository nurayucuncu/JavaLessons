import java.util.Scanner;

public class Hw5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("faktöriyelini almak istediğiniz sayıyı giriniz:");
        int sayı=scanner.nextInt();
        if(sayı<0){
            System.out.println("negatif sayıların faktöriyeli tanımsızdır");
        }else{
            int sum=1;
            for(int i=2;i<=sayı;++i){
                sum *=i;
            }
            System.out.println("faktöriyel:"+ sum);
        }

    }
}