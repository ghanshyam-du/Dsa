import java.util.*;
public class FirstOcc {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of arr index: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the value of arr: ");

        for(int i = 0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value for which you have to find the first occ: ");
        int a = sc.nextInt();
        int fi = firstIndex(arr,0,a);
        System.out.println("So the first occ is at index: "+ fi);
    }
    public static int firstIndex(int[] arr, int idx, int x){
        if(idx == arr.length){
            return -1;
        }

         if(arr[idx] == x){
            return idx;
        }
        else{
             int fir = firstIndex(arr, idx+1, x);
            return fir;
        }

       
       
    }
}
