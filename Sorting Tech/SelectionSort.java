

public class SelectionSort {
    public static void main(String args[]){
        int[] arr = {7,5,9,2,8};
       
        for(int i = 0; i< arr.length; i++){
            int mini = i;

            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[mini ]){
                    mini = j;
                }
            }
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }

        for(int i = 0; i< arr.length; i++){
            System.out.print( arr[i]);
        }

       
    }
    
}
