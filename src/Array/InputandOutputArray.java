package Array;

import java.util.Scanner;

public class InputandOutputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[] arr ={5,6,8,2,1,9,12};
//         System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);
//        System.out.println(arr[4]);
//        System.out.println(arr[5]);
//        System.out.println(arr.length);
//        for(int i=0;i<=6;i++){
//            System.out.print(arr[i]+" ");
//        }
        int[] anoop = new int[7];
        for (int i = 0; i <= 7; i++) {

        }
        for (int i = 0; i <anoop.length; i++) {
            anoop[i] = sc.nextInt();

        }
        for (int i = 0; i < anoop.length; i++) {
            System.out.print(2 * anoop[i] + " ");
        }
    }
}
