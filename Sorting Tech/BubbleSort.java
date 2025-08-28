public class BubbleSort {
    public static void main(String args[]) {
        int[] arr = { 12, 3, 4, 15, 6, 2 };
        bubble(arr);

        System.out.println("Hence the sorted array is :");
        for (int num : arr) {
            System.out.println(num + " ");
        }
    }

    public static void bubble(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }
}
