package Basic_DSA;

import java.util.Scanner;

public class numberOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n=sc.nextInt();
        if(n==0) n=1;
        int count=0;
        while (n!=0) {
            n =n/ 10;
            count++;
        }
            System.out.print(count);

    }
}
