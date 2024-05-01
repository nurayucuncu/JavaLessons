import java.util.Random;

public class Hw8 {
    public static void main(String[] args) {
        Random random=new Random();
        int deneme=1;
        while(true) {
            int zar1 = random.nextInt(6) + 1;
            int zar2 = random.nextInt(6) + 1;
            System.out.println(zar1 + "-" + zar2);

            if (zar1 == 6 && zar2 == 5) {
                System.out.println(deneme+ "denemede 6-5 geldi");
                break;
            }else{
                deneme++;
            }
        }

    }
}