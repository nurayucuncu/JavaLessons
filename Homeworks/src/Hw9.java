import java.util.Scanner;
public class Hw9 {
    public static void bubbleSort() {

        System.out.println("Bubble Sort");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizinin boyutunu giriniz: ");
        int sayi = scanner.nextInt();

        int[] arr = new int[sayi];

        System.out.println("Dizinin elemanlarini giriniz:");
        for (int i = 0; i < sayi; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Sirasiz dizi: ");
        for (int i = 0; i < sayi; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < sayi - 1; i++) {
            for (int j = 0; j < sayi - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("\nSirali dizi: ");
        for (int i = 0; i < sayi; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        bubbleSort();
    }
}