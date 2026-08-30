// LeetCode POTD - Removing Minimum and Maximum From Array
// https://leetcode.com/problems/removing-minimum-and-maximum-from-array/
// Solved: 2026-08-30
//
// Approach: Find index of min and max element. To remove both, there are only
// 3 possible strategies (since removals must come from front/back only):
//   Case 1: remove everything up to and including the later of the two indices (from front)
//   Case 2: remove everything from the earlier of the two indices to the end (from back)
//   Case 3: remove from front up to the earlier index, AND from back down to the later index (split)
// Answer = min of all three cases.
//
// Time: O(n), Space: O(1)

class Solution {
    public int minimumDeletions(int[] nums) {
        int minValue = nums[0];
        int maxValue = nums[0];
        int minIdx = 0;
        int maxIdx = 0;

        for(int i = 1; i < nums.length; i++)
        {
            if(nums[i] < minValue)
            {
                minValue = nums[i];
                minIdx = i;
            }
            if(nums[i] > maxValue)
            {
                maxValue = nums[i];
                maxIdx = i;
            }
        }
        int n = nums.length;

        // case 1: remove from front through the later index
        int case1 = Math.max(minIdx, maxIdx) + 1;
        // case 2: remove from the earlier index through the end
        int case2 = n - Math.min(minIdx, maxIdx);
        // case 3: remove from both ends (split)
        int case3 = Math.min(minIdx, maxIdx) + 1 + n - Math.max(minIdx, maxIdx);

        int temp = Math.min(case1, case2);
        int ans = Math.min(case3, temp);

        return ans;
    }
}
