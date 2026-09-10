package Array;

public class missingelement {
    public static void main(String[] args) {
        long[] arr={1,3,4,5};
        long n=arr.length+1;
        long sum = n*(n+1)/2;
        long arrSum = 0;

            for (long ele : arr) {
                arrSum += ele;
            }

        System.out.println(sum-arrSum);
    }
}
