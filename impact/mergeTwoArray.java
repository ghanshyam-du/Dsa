public class mergeTwoArray {
    public static void main(String[]args){
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};
        int n = arr1.length + arr2.length;
        int[] mergedArray = new int[n];
        
        int i = 0, j = 0, k = 0;
        
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                mergedArray[k++] = arr1[i++];
            } else {
                mergedArray[k++] = arr2[j++];
            }
        }
        
        while (i < arr1.length) {
            mergedArray[k++] = arr1[i++];
        }
        
        while (j < arr2.length) {
            mergedArray[k++] = arr2[j++];
        }
        
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }
}
