package Methods;

import java.util.Scanner;

public class swaptwonumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value a:");
        int a=sc.nextInt();
        System.out.print("Enter value b:");
        int b=sc.nextInt();
        // Before swapping
        System.out.println(a+" "+b);
        int temp =a;
        a=b;
        b=temp;
       // After swapping
        System.out.println(a+" "+b);
    }
}
