import java.util.Arrays;

public class Reverse {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11};
        int n = arr.length;
        int start = 0;
        int end = n-1;

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;

            end--;      
        }
        System.out.print(Arrays.toString(arr));
    }
}
