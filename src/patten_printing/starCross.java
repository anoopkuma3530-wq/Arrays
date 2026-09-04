package patten_printing;

import java.util.Scanner;

public class starCross {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row:");
        int row = sc.nextInt();
        System.out.print("Enter col:");
        int col = sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                if(i==j || i+j==row+1)
                    System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
