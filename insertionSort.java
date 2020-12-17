import java.util.Scanner;

public class insertionSort {

    public void sort(int[] arr) {
        int len = arr.length;

        // loop invariant: all items before item in ith index is sorted
        for (int i = 1; i < len; i++) {
            int key = arr[i];

            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void printArr(int[] arr) {
        int len = arr.length;

        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arrSize = sc.nextInt();
        int[] arr = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
        
        insertionSort ob = new insertionSort();
        ob.sort(arr);
        printArr(arr);
    }
}