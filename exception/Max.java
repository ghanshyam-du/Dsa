import java.util.Scanner;

public class Max {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[]  arr = new int[5];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        max(arr, 0);
    }
    public static void max(int[] arr, int idx){

       int maxi = max(arr, idx);
       if(maxi > arr[idx]){

       }

    }
}
