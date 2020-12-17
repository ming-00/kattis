import java.util.Scanner;

public class quickSort {

    public void sort(int arr[], int low, int high) {
        if (low < high) 
        { 
            /* pi is partitioning index, arr[pi] is  
              now at right place */
            int pi = partition(arr, low, high); 
  
            // Recursively sort elements before 
            // partition and after partition 
            sort(arr, low, pi-1); 
            sort(arr, pi+1, high); 
        }
    }

    public int partition(int[] arr, int lower, int upper) {

        // sort elements around pivot
        int pivot = arr[lower];
        int lowerCounter = lower + 1;
        int upperCounter = upper + 1;

        while (lowerCounter < upperCounter) {
            while (arr[lowerCounter] < pivot && lowerCounter < upperCounter) {
                lowerCounter++;
            }
            while (lowerCounter < upperCounter && arr[upperCounter] > pivot) {
                    upperCounter--;
            }
            if (lowerCounter < upperCounter) {
                swap(arr,lowerCounter,upperCounter);
            }
        }

        swap(arr,lower,lowerCounter - 1);
        return lowerCounter - 1;
    }

    public void swap(int[] arr, int firstElement, int secondElement) {
        int temp = arr[firstElement];
        arr[firstElement] = arr[secondElement];
        arr[secondElement] = temp;
    }

    public static void printArray(int[] arr, int len) {
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int arrSize = sc.nextInt() + 1;
        int[] arr = new int[arrSize];
        for (int i = 0; i < arrSize - 1; i++) {
            System.out.println("Enter next array element: ");
            arr[i] = sc.nextInt();
        }
        arr[arrSize - 1] = Integer.MAX_VALUE;
        sc.close();


        quickSort qs = new quickSort();
        qs.sort(arr, 0, arr.length - 2);
        printArray(arr, arrSize - 1);
    }
}