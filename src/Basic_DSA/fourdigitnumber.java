package Basic_DSA;

import java.util.Scanner;

public class fourdigitnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = sc.nextInt();
        if(n>999 && n<10000){
//        if(n>=0) System.out.println(n);
//        else System.out.println(-n);
//        if(n<69){
//            System.out.print("true");
//        }
//        else{
//            System.out.println("false");
//        }
//        if(n%10==n){
            System.out.println("4 digit number.");
        }
        else{
            System.out.println("not a 4 digit number.");
        }

    }
}
