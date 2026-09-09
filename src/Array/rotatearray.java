package Array;

import java.util.Arrays;

public class rotatearray {
    public void rotateArr(int arr[], int d) {
        int n = arr.length;
        d %= n;
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }

    static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 8, 9, 6, 7, 5};
        int d = 2;
        rotatearray obj = new rotatearray();
        obj.rotateArr(arr, d);
        System.out.println(Arrays.toString(arr));
    }
}