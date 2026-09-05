package Methods;

public class Argument {
//    public static void max(int a,int b,int c){
        //maximum of three numbers
//        if(a>=b && a>=c) System.out.println(a);
//        else if(b>=a && b>=c) System.out.println(b);
//        else System.out.println(c);
public static int max(int a,int b,int c){
        if(a>=b && a>=c) return a;
        else if(b>=a && b>=c) return b;
        else return c;
    }

    public static void main(String[] args) {
        System.out.println(max(9,4,8));
    }
}
