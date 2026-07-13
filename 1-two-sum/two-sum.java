class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {
                    // return new int[] { i, j };

                    int result[] = { i, j };
                    return result; // first return is used when the target pair is found and exits
                }
            }
        }

        // return new int[] {};
        int result[] = {};
        return result; // The second return is a fallback that returns an empty array if no valid pair exists.
    }
}