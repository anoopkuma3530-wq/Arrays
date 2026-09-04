package Basic_DSA;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SI {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter principle amount:");
        int p = sc.nextInt();
        System.out.print("Enter rate:");
        int r = sc.nextInt();
        System.out.print("Enter time:");
        int t = sc.nextInt();
        int SI=(p*r*t)/100;
        System.out.println("Simple interest is:"+SI);
        System.out.println("Total amount is:"+(p+SI));


    }
}
