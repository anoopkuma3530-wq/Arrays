package Basic_DSA;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        double n = sc.nextDouble();
//        if(n>=0){
//            System.out.println(n);
//        }
//        else{
//            System.out.println(-n);
//        }
          int x = (int)n;
          if(n-x==0){
              System.out.println("integer.");
          }
          else{
              System.out.println("Not integer.");
          }


    }
}
