import java.util.Arrays;

public class ValidMountainArray {
    
    public boolean run(int[] arr) {
        int len = arr.length;
        if (len < 3) return false;
        int peak = len - 1;
        // up to peak
        for (int i = 1; i < len; i++) {
            if (arr[i] < arr[i-1]) {
                peak = i - 1;
                System.out.println(peak);
                break;
            }
            if (arr[i] == arr[i-1]) return false;
        }
        if (peak == len - 1 || peak == 0) return false;
        for (int i = peak + 1; i < len; i++) {
            if (arr[i] >= arr[i-1]) return false;
        }
        return true;
    }
    

    public static void main(String[] args) {
        int[] arr = {17,18,5,4,6,1};
        ValidMountainArray v = new ValidMountainArray();
        //System.out.println(v.run(arr));
        v.run(arr);
    }
}
