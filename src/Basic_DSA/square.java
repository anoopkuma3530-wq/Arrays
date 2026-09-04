package Basic_DSA;

import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        double n = sc.nextDouble();
        double square = n*n;
        System.out.println("Square of the given number:"+square);
    }
}
