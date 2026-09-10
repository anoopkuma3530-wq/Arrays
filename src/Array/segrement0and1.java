package Array;

public class segrement0and1 {
    public static void main(String[] args) {
        int[] arr={0,1,0,1,0,0,0,1,1,0,1,0};
        int numberofZero = 0;
        int numberofOnes = 0;

        // Step 1: Count 0s and 1s
        for (int ele : arr) {
            if (ele == 0) numberofZero++;
            else numberofOnes++;
        }

        // Step 2: Overwrite array with 0s first, then 1s
        for (int i = 0; i < arr.length; i++) {
            if (i < numberofZero) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
            System.out.print(arr[i]+" ");
        }

    }
}
