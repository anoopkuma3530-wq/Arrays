package Basic_DSA;

import java.util.Scanner;

public class reverseofnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = sc.nextInt();
        int reverse=0;
        int sum=0;
        if(n<0) n=-n;

        while (n!=0){
            int remainder =n%10;
            reverse *=10;
            reverse +=remainder;
            n /=10;
            if(n<0) reverse=-reverse;
        }
        System.out.println("reverse of number:"+reverse);
    }
}
