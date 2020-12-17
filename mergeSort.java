import java.util.Scanner;

public class mergeSort {

    public void sort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = low + (high-low)/2;
            sort(arr, low, mid);
            sort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }       
    }

    // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    public void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high-low+1];

        int counter = 0;
        int pointer1 = low;
        int pointer2 = mid + 1;

        // compare two subarrays and put elements by ascending order into temp array
        while (pointer1 < mid + 1 && pointer2 < high + 1) {
            if (arr[pointer1] < arr[pointer2]) {
                temp[counter] = arr[pointer1];
                pointer1++;
            } else {
                temp[counter] = arr[pointer2];
                pointer2++;
            }
            counter++;
        }

        // put remaining uncompared elements
        while (pointer1 < mid + 1) {
            temp[counter] = arr[pointer1];
            pointer1++;
            counter++;
        }

        while (pointer2 < high + 1) {
            temp[counter] = arr[pointer2];
            pointer2++;
            counter++;
        }

        // rewrite elements in arr by transfering elements in temp array
        int rewriteCounter = low;
        for (int i=0; i < high-low+1; i++) {
            arr[rewriteCounter] = temp[i];
            rewriteCounter++;
        }
    }

    public static void printArray(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int arrSize = sc.nextInt();
        int[] arr = new int[arrSize];
        
        for (int i = 0; i < arrSize; i++) {
            System.out.println("Enter next array element: ");
            arr[i] = sc.nextInt();
        }
        sc.close();

        mergeSort ms = new mergeSort();
        ms.sort(arr, 0, arr.length-1);
        printArray(arr);
    }
}
