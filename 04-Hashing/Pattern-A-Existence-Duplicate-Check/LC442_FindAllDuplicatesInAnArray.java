// LC 442 - Find All Duplicates in an Array (Medium)
// Pattern: Existence check via in-place negation marking (O(n) time, O(1) extra space)
// Trigger: values constrained to [1, n] -> mirror of "Find Disappeared Numbers" (that finds MISSING,
//   this finds numbers seen TWICE)
// Logic: for each value, go to index (val-1). If already negative -> val was seen before -> duplicate.
//   Otherwise negate it to mark as seen.

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int num = Math.abs(nums[i]);
            int idx = num - 1;
            if (nums[idx] < 0)
                result.add(num);
            nums[idx] *= -1;
        }
        return result;
    }
}
