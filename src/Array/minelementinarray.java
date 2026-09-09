package Array;

public class minelementinarray {
    public static void main(String[] args) {
        int[] arr = {4,5,8,7,9,6,3,5,4};
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }

        System.out.println("Maximum element is: " + min);

    }
}
