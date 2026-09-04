package Basic_DSA;

import java.util.Scanner;

public class ap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = sc.nextInt();
        for (int i=2;i<=3*n-1;i=i+3){
            System.out.print(i+" ");
        }
    }
}
