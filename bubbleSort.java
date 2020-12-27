import java.util.Scanner;

public class bubbleSort {

    public void sort(int[] arr) {
        int len = arr.length;

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len-i-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap positions
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
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
        int arrSize = sc.nextInt();
        int[] arr = new int[arrSize];

        for (int i = 0; i < arrSize; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        bubbleSort bs = new bubbleSort();
        bs.sort(arr);
        printArray(arr);
    }
}