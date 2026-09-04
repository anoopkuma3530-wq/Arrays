package Basic_DSA;

import java.util.Scanner;

public class sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();
//        int n=5;
        for(int i=1;i<=n;i++){
            System.out.println(i+" ");
            System.out.println(n-i+1+"");
            if(i%2==0){
                System.out.println(n/2+1);
            }
        }
    }
}
