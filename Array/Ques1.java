import java.util.*;

// find the largest element in an array 
public class Ques1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter the value of the array ");
        for(int i = 0; i< 5; i++){
            arr[i] = sc.nextInt();
        }
        int maxi = maximum(arr);
        System.out.println(maxi);
    }
    public static int maximum(int[] arr){
        int n = arr.length;

        int max = arr[0];

        for(int i =1; i< arr.length; i++){
            if(max < arr[i]){
                max = arr[i];

            }
        }
        return max;


    }
}
