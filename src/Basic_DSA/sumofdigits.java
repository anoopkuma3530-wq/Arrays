package Basic_DSA;

import java.util.Scanner;

public class sumofdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numner:");
        int n=sc.nextInt();
        int sum=0;
        if(n<0) n=-n;
        while(n != 0){
            int remainder=n%10;
            sum +=remainder;
            n=n/10;
        }

        System.out.print("sum of the digits:"+sum);
    }
}
