import java.util.Scanner;

public class LastOcc {
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
        int fi = lastIndex(arr,0,a);
        System.out.println("So the first occ is at index: "+ fi);
    }

    public static int lastIndex(int[] arr, int idx, int p){


        if(idx == arr.length) {return -1;}

        int main = lastIndex(arr, idx +1, p);

        if(main == -1){
            if(arr[idx] == p) 
            {
                return idx;
            }
            else{
                return -1;
            }
        }
        else{
            return main;
        }
        


    }
}
