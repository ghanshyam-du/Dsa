
public class SelectionSort {
    public static void main(String args[]) {
        int[] arr = { 29, 10, 14, 37, 13 };

        selection(arr);

        for (int num : arr) {
            System.out.println(num + " ");
        }

    }

    public static void selection(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

}
