public class HeapSort {
    public static void heapSort(int[] arr) {
        int n = arr.length;

        // Step 1: Build a max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        System.out.println("Max heap:");
        maxHeap(arr);

        //Step 2 and Step 3: Extract elements and re-establish max heap
        for (int i = n - 1; i > 0; i--) {
            // Swap the root (maximum element) with the last unsorted element
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Re-establish the max heap for the reduced heap
            heapify(arr, i, 0);
        }
    }

    public static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int leftChild = 2 * i + 1;
        int rightChild = 2 * i + 2;

        // Find the largest element among root, left child, and right child
        if (leftChild < n && arr[leftChild] > arr[largest]) {
            largest = leftChild;
        }

        if (rightChild < n && arr[rightChild] > arr[largest]) {
            largest = rightChild;
        }

        // If the largest element is not the root, swap and continue heapifying
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, n, largest);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 14, 33, 27, 10, 35, 19, 42, 44 };

        System.out.println("Original Array:");
        printArray(arr);

        heapSort(arr);



        System.out.println("Sorted Array:");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void maxHeap(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
