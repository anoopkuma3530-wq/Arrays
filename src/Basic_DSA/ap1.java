package Basic_DSA;

import java.util.Scanner;

public class ap1 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("enter number:");
//        int n = sc.nextInt();
//        for (int i=99;i>=103-4*n;i=i-4){
//            System.out.print(i+" ");
//        }
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number:");
        int n = sc.nextInt();
        int a =99  , d=-4;
        for (int i=99;i>=103-4*n;i=i-4){
            System.out.println(i+" ");
            a +=d;
        }


    }
}
