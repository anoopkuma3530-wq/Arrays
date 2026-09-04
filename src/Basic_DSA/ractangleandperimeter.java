package Basic_DSA;

import java.util.Scanner;

public class ractangleandperimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length:");
        int l = sc.nextInt();
        System.out.print("Enter breadth:");
        int b = sc.nextInt();
        int area,perimeter;
        area =l*b;
        System.out.print("Area is:"+area+"\n");
        perimeter = 2*(l+b);
        System.out.print("Perimeter is:"+perimeter+"\n");

        if(area>perimeter) System.out.println("area is greather than perimeter.");
        if(area<perimeter) System.out.println("perimeter is greather than area.");
        if(area==perimeter) System.out.println("both are equal.");


    }
}
