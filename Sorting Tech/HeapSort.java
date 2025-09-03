public class HeapSort {

    // Function to heapify a subtree
    public static void heapify(int[] arr, int n, int i) {
        int largest = i;           // root
        int leftLeaf = 2 * i + 1;  // left child
        int rightLeaf = 2 * i + 2; // right child

        // If left child is larger
        if (leftLeaf < n && arr[leftLeaf] > arr[largest]) {
            largest = leftLeaf;
        }

        // If right child is larger
        if (rightLeaf < n && arr[rightLeaf] > arr[largest]) {
            largest = rightLeaf;
        }

        // If largest is not root
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            // Recursively heapify the affected subtree
            heapify(arr, n, largest);
        }
    }

    // Heap Sort function
    public static void heapSort(int[] arr) {
        int n = arr.length;

        // Step 1: Build Max Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Step 2: Extract elements from heap one by one
        for (int i = n - 1; i >= 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Heapify reduced heap.
            heapify(arr, i, 0);
        }
    }

    // Print array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String args[]) {
        int arr[] = {4, 10, 3, 5, 1};

        System.out.println("Original array:");
        printArray(arr);

        heapSort(arr);

        System.out.println("Sorted array:");
        printArray(arr);
    }
}
