package Array;

import java.util.Scanner;

public class closestnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number n:");
        int n =sc.nextInt();
        System.out.print("Enter number m:");
        int m =sc.nextInt();
        int q = n / m;

        int m1 = q * m;
        int m2;

        if (n * m > 0)
            m2 = (q + 1) * m;
        else
            m2 = (q - 1) * m;


        int d1 = Math.abs(n - m1);
        int d2 = Math.abs(n - m2);

        if (d1 < d2)

        System.out.println(m1);
        else if (d2 < d1)
            System.out.println(m2);
        else
            System.out.println((Math.abs(m1) > Math.abs(m2)) ? m1 : m2);
    }
}
