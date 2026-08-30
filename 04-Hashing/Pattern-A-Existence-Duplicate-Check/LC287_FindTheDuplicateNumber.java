// LC 287 - Find the Duplicate Number (Medium)
// Pattern: Existence check WITHOUT extra space or modifying the array -> Floyd's Cycle Detection
// Trigger: values in [1,n] over n+1 slots means nums[i] can be treated as "next pointer" -> guaranteed cycle
// Bug fixed: starting slow == fast == nums[0] makes the first while loop never execute (TLE).
//   Fix: pre-advance fast one hop (fast = nums[nums[0]]) before the loop so slow != fast initially.

class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[nums[0]];   // pre-advanced one hop to avoid slow==fast at start

        while(slow != fast)
        {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }

        slow = 0;
        while(slow != fast)
        {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}
