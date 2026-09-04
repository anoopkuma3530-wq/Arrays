package Basic_DSA;

import java.util.Scanner;

public class TernaryBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number a:");
        int a = sc.nextInt();
        System.out.print("Enter number b:");
        int b = sc.nextInt();
        System.out.print("Enter number c:");
        int c = sc.nextInt();
        // Maximum
        System.out.println(Math.max(a, Math.max(b, c)));

// Minimum
        System.out.println(Math.min(a, Math.min(b, c)));
//        System.out.println((n%2==0) ? "Even":"odd");
//        int anoop = (n>=0) ? 100:0;
//        System.out.println(anoop);
    }
}
