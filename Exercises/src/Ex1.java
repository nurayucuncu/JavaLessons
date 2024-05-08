public class Ex1 {
    public static void main(String[] args) {

        int arr[] = {2,-9,0,5,12,-25,22,9,8,12};
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum= sum +arr[i];
        }
        System.out.println("sum:"+sum);
        double ort=(double)sum/arr.length;
        System.out.println(ort);

    }
}
