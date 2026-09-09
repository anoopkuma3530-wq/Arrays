package Array;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {3,8,2,1,6,9,4,7,5};
        int n=arr.length;
        int i=0,j=n-1;
        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int ele:arr) System.out.print(ele+" ");
    }
}
