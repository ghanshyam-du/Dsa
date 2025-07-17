import java.util.*;

// find the second largest element in an array 
public class Ques2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter the value of the array ");
        for(int i = 0; i< 5; i++){
            arr[i] = sc.nextInt();
        }
        int secMaxi = maximum(arr);
        System.out.println(secMaxi);
    }
    public static int maximum(int[] arr){
        int n = arr.length;

        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        // for(int i = 0; i< arr.length; i++){
        //     max = Math.max(max, arr[i]);
        // }
        // for(int i = 0; i< arr.length; i++){
        //     if(arr[i] > secMax &&  arr[i] != max){
        //         secMax = arr[i];
        //     }
        // }


        for(int i = 0; i< n; i++){
            if(arr[i] > max){
                max = arr[i];
            }else if(arr[i] >secMax){{
                secMax = arr[i];
            }
            }
        }

        return secMax;


    }
}
