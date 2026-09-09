package Array;

public class secondlargestelementelement {
    public static void main(String[] args) {
        int[] arr={4,10,6,3,8};
        int max=Integer.MIN_VALUE;
        int Smax=Integer.MIN_VALUE;

        //calculate max
        for (int i=0;i<arr.length;i++) {
            if (arr[i] > max) max = arr[i];
        }
            //calculate second max
            for(int i=0;i<arr.length;i++){
                if(arr[i]>Smax && arr[i]!=max) Smax=arr[i];
            }

            System.out.println("max "+max);
            System.out.println("Smax "+Smax);

        }
    }

