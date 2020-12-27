public class MedianOfTwoArrays {
    public double getMedian(int[] arr1, int[] arr2, int median) {

        return 1.0;
    }

    public double run(int[] arr1, int[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;
        int totalLen = len1 + len2;
        int median =  totalLen / 2;
        double ans;
        if (totalLen%2 == 0) {
            ans = getMedian(arr1, arr2, median);
        } else {
            ans = ((double) (getMedian(arr1, arr2, median) + getMedian(arr1, arr2, median + 1)))/2;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6,7};
        MedianOfTwoArrays m = new MedianOfTwoArrays();
        System.out.println(m.run(arr1, arr2));
    }
}
