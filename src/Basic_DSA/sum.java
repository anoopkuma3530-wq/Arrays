package Basic_DSA;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number a:");
        int a = sc.nextInt();
        System.out.print("Enter number b:");
        int b = sc.nextInt();
        System.out.print("Enter number c:");
        int c = sc.nextInt();
        int sum = a+b+c;
        System.out.println("sum of the given numbers:"+sum);

    }
}
