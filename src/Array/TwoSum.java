package Array;

public class TwoSum {
    boolean twoSum(int arr[], int target) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] + arr[j] == target)
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        TwoSum solver = new TwoSum();
        int[] arr = {2, 7, 11, 15};
        int target = 9;

        System.out.println(solver.twoSum(arr, target)); // Output: true
    }
}