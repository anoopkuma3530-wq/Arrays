package Array;

public class searchpositiveandnegativenumber {
    public static void main(String[] args) {
        int [] arr={2,-6,4,5,-8,-7,9};

        System.out.print("Positive numbers: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) System.out.print(arr[i] + " ");
        }

        System.out.print("\nNegative numbers: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) System.out.print(arr[i] + " ");
        }
    }
}