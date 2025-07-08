import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]  arr = new int[5];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        Reverse(arr, 0);

        
    }
    public static void Reverse(int[] arr, int idx){
        if(idx == arr.length){
            return ;
        }

        Reverse(arr, idx+1);
        System.out.println(arr[idx]);
    }
}
