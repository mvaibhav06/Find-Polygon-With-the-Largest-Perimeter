import java.util.Arrays;

public class LargestPerimeter {
    public static long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long sum = 0;

        for(int i=0; i<nums.length; i++){
            sum += nums[i];
        }

        int j = nums.length-1;
        while(sum-nums[j] <= nums[j]){
            if(j<3) return -1;
            sum -= nums[j];
            j--;

        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {50,12,2,3,4};
        System.out.println(largestPerimeter(nums));
    }
}
