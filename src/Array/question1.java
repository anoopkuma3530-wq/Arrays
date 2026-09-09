package Array;

public class question1 {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60};
        for(int i=0;i<=5;i++){
            if(i%2==0){
                System.out.print((arr[i] *=2) + " ");



            }
            else {
                System.out.print((arr[i] +=10 )+ " ");
            }
        }
    }
}
