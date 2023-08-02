
public class Main {
    public static void main(String[] args) {
        int[] nums = {3, 4, -1, 1};
        int result = firstMissingPositive(nums);
        System.out.println("The smallest missing positive integer is: " + result);
    }
    public static int firstMissingPositive(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            while (nums[i] > 0 && nums[i] <= nums.length && nums[nums[i] - 1] != nums[i]) {
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }


        return nums.length + 1;
    }
}