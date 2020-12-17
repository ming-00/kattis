import java.util.Scanner;

public class selectionSort {

    public void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int smallestIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[smallestIndex]) {
                    smallestIndex = j;
                }
            }
            if (smallestIndex != i) {
                int temp = arr[i];
                arr[i] = arr[smallestIndex];
                arr[smallestIndex] = temp;
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
        System.out.println("Enter array size: ");
        int arrSize = sc.nextInt();
        int[] arr = new int[arrSize];
        
        for (int i = 0; i < arrSize; i++) {
            System.out.println("Enter next array element: ");
            arr[i] = sc.nextInt();
        }
        sc.close();        

        selectionSort ss = new selectionSort();
        ss.sort(arr);
        printArray(arr);
    }
}
