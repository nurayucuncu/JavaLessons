public class Hw7 {
    public static void main(String[] args) {
        int arr[] = {31,37,42,57,84};
        for (int i = 0; i < arr.length; i++) {
            int not = arr[i];
            int round = ((not / 5) + 1) * 5;

            if (not < 38) {
                System.out.println("başarısız not");

            } else {
                if (round - not < 3) {
                    not = round;
                }
            }

            System.out.println("not : " + not);
        }
    }
}
