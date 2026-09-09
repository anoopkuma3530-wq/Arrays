package Array;

import java.util.Scanner;

public class searchinarray {
    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        int[] arr={10,20,30,40,50,60,70,80};
//        for (int i=0;i<=7;i++){
//            System.out.print("Enter a element:");
//            int ar=sc.nextInt();
//            if(ar==arr[i]) System.out.println("exists");
//            else System.out.println("not exists");
//        }
//        System.out.println();
        Scanner sc = new Scanner(System.in);
        int[] arr={10,20,30,40,50,60,70,80};
        System.out.print("Enter a element to search:");
        int ar = sc.nextInt();

        boolean found = false;
        for(int i=0;i<arr.length;i++) {
            if (arr[i] == ar) {
                found = true;

                break;
            }
        }
        if(found){
            System.out.println("exixts");
        }
        else {
            System.out.println("not exists");
        }

    }
}
