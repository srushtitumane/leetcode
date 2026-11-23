class Solution {
    public boolean isGood(int[] nums) {
        Arrays.sort(nums);

        int max = nums[nums.length - 1];

        if (max != nums.length - 1)
            return false;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != i + 1)
                return false;
        }

        return nums[nums.length - 2] == max;
        
    }
}