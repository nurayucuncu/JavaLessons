import java.util.Scanner;

public class Hw3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n,sum=0,i=0;
        System.out.printf("n sayısını gir:");
        n = scanner.nextInt();

        // sum=(n*(n+1))/2;

      /*  while(i < n){
            i++;
            sum = sum + i;
            System.out.println("sum  : " + sum);
            System.out.println("i : " + i);
        }
        */
        for(int j=1; j<=n; j++){
            sum = sum + j;
            System.out.println("sum  : " + sum);
            System.out.println("j : " + j);
        }

        System.out.println("sum:" + sum);



    }
}
