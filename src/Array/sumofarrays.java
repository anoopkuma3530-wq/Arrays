package Array;

public class sumofarrays {
    public static void main(String[] args) {
        int[] arr = {4,5,-9,6,3,-7,2,-3};
        int sum=0;
        for(int i=0;i<arr.length;i++) {
            sum += arr[i];
        }
        System.out.println("sum of array:"+sum);

    }
}
