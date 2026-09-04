package Basic_DSA;

import java.util.Scanner;

public class RelationalOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number a:");
        int a = sc.nextInt();
        System.out.print("Enter number b:");
        int b = sc.nextInt();
        System.out.print("Enter number c:");
        int c = sc.nextInt();
        if(a>b && b>c){
            System.out.println("a is greatest number");

        }
        if(b>c && c>a){
            System.out.println("b is greatest number");
        }
        else{
            System.out.println("c is greatest number");
        }
    }
}
