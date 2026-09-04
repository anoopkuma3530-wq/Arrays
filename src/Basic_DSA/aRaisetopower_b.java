package Basic_DSA;

import java.util.Scanner;

public class aRaisetopower_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number a:");
        int a = sc.nextInt();
        System.out.print("Enter number b:");
        int b = sc.nextInt();
        int power=1;for(int i=1;i<=b;i++){
            power *=a;
        }
        System.out.println(a+" raise to the power "+b+" is "+power);
    }
}
