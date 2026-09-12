package Array;

import java.util.Collections;
import java.util.Vector;

public class AddingOne {

    public static Vector<Integer> addOne(int[] arr) {
        Vector<Integer> ans = new Vector<>();
        int n = arr.length;
        int carry = 1;


        for (int i = n - 1; i >= 0; i--) {
            int sum = arr[i] + carry;
            ans.add(sum % 10);
            carry = sum / 10;
        }

        if (carry == 1) {
            ans.add(1);
        }


        Collections.reverse(ans);
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8};


        Vector<Integer> result = addOne(arr);
        System.out.println(result);
    }
}