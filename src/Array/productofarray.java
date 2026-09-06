package Array;

public class productofarray {
    public static void main(String[] args) {
        int[] arr = {4,5,-9,6,3,-7,2,-3};
        int product=1;
        for(int i=0;i<arr.length;i++) {
            product *= arr[i];
        }
        System.out.println("product of array:"+product);

    }

}
