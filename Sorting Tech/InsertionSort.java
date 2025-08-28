public class InsertionSort {
    public static void main(String args[]) {
        int[] arr = { 6, 1, 7, 4, 2, 9, 8, 5, 3 };

        insertion(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    private static void insertion(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;

        }
    }
}
