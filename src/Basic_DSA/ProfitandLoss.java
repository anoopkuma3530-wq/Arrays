package Basic_DSA;

import java.util.Scanner;

public class ProfitandLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cost price:");
        double cp = sc.nextDouble();
        System.out.print("Enter selling price:");
        double sp = sc.nextDouble();
//        if(sp>cp){
//            System.out.print("PROFIT");
//        }
//        if(sp<cp){
//            System.out.print("LOSS");
//        }
//        if(sp==cp){
//            System.out.println("NO PROFIT NO LOSS");
//        }
        if(sp>cp){
            System.out.print("PROFIT is " +(sp-cp));
        }
        else if(sp<cp){
            System.out.print("LOSS is " +(cp-sp));
        }
        else{
            System.out.println("NO PROFIT NO LOSS");
        }
    }
}
