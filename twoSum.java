import java.util.Arrays;

class twoSum {
    public static int[] calc(int[] nums, int target) {
        int[] answer = new int[2];
        int[] spareArr = new int[nums.length];
        
        for (int i = 0; i < nums.length; i++) {
            spareArr[i] = nums[i];
        }
        
        Arrays.sort(nums);
        int low = 0;
        int high = nums.length-1;
        
        while (low < high) {
            int value = nums[low] + nums[high];
            if (value > target) {
                high--;
            } else if (value < target) {
                low++;
            } else {
                break;
            }
        }
        int lowAnswer = nums[low];
        int highAnswer = nums[high];
        
        for (int i = 0; i < nums.length; i++) {
            if (spareArr[i] == lowAnswer) {
                answer[0] = i;
                break;
            } 
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            if (spareArr[i] == highAnswer) {
                answer[1] = i;
                break;
            } 
        }
        return answer;
    } 
    public static void main(String[] args) {
        int[] nums = {2, 5, 5, 11};
        int[] ans = calc(nums, 10);
        System.out.println(ans[0] + " " + ans[1]);
    }
}
