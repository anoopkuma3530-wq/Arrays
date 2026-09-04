package Basic_DSA;

import java.util.Scanner;

public class gp {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int a=1 ,r=2 ;
        System.out.print("Enter number:");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            a *=r;

        }
//        Scanner sc =new Scanner(System.in);
//        System.out.print("Enter number:");
//        int n = sc.nextInt();
//        for(int i=1;i<=n;i++){
//            System.out.println((int)Math.pow(2, i - 1));


    }
}
