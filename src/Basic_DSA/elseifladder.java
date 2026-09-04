package Basic_DSA;

import java.util.Scanner;

public class elseifladder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();
        if(n%5==0 && n%3==0){
            System.out.print("Anoop");
        }
        else if(n%3==0){
            System.out.print("Kumar");
        }
        else if(n%5==0){
            System.out.print("Prajapati");
        }

        else {
            System.out.print("AKP");
        }

    }
}
