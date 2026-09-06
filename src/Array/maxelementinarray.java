package Array;

import javax.naming.ldap.ManageReferralControl;

public class maxelementinarray {
    public static void main(String[] args) {
        int[] arr = {4,5,8,7,9,6,3,5,4};
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }

        System.out.println("Maximum element is: " + max);

    }
}
