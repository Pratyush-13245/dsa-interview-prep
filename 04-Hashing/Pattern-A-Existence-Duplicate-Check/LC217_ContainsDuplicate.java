// LC 217 - Contains Duplicate
// Pattern: Existence/Duplicate check via HashSet
// Trigger: check-before-add during a single pass, early exit on first duplicate

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();

        for(int i=0;i<nums.length;i++)
        {
            if(seen.contains(nums[i]))
            {
                return true;
            }
            seen.add(nums[i]);
        }
        return false;
    }
}
