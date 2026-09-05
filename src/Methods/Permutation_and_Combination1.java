package Methods;

import java.util.Scanner;

public class Permutation_and_Combination1 {
    public static int fact(int x){
        int f=1;
        for(int i=1;i<=x;i++){
            f *= i;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value n:");
        int n=sc.nextInt();
        System.out.print("Enter value r:");
        int r=sc.nextInt();
        int nCr = fact(n)/(fact(r)*fact(n-r));
        int nPr = fact(n)/fact(n-r);
        System.out.println(nCr);
        System.out.println(nPr);
    }
}
