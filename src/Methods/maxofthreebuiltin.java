package Methods;

import java.util.Scanner;

public class maxofthreebuiltin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number a:");
        double a= sc.nextDouble();
        System.out.print("Enter number b:");
        double b= sc.nextDouble();
        System.out.print("Enter number c:");
        double c= sc.nextDouble();
        System.out.print("Enter number d:");
        double d= sc.nextDouble();
        // maximum of three numbers
        System.out.println(Math.max(Math.max(a,b),c));

        //minimum of three numbers
        System.out.println(Math.min(Math.min(a,b),c));

        // maximum of four numbers
//        System.out.println(Math.max(Math.max(Math.max(a,b),c),d));

//        double max1 = Math.max(a,b);
//        double max2= Math.max(c,d);
//        System.out.println(Math.max(max1,max2));
        System.out.println(Math.max(Math.max(a, b), Math.max(c, d)));

        //minimum of three numbers

        System.out.println(Math.min(Math.min(a, b), Math.min(c, d)));
    }
}
