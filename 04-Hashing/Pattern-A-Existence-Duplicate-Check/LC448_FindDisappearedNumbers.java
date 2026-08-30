// LC 448 - Find All Numbers Disappeared in an Array
// Pattern: Existence check via HashSet (not HashMap - only presence matters, not frequency)
// Trigger: values are constrained to range [1, n], check which of 1..n are missing
// Follow-up (O(1) extra space): in-place negation marking using the array itself as a hashset
//   - for each value x seen, negate nums[x-1] (if not already negative)
//   - at the end, any index j where nums[j] is still positive means (j+1) was never seen
//   - not yet implemented, HashSet version below is the current solution

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> st = new HashSet<>();

        for(int i=0;i<nums.length;i++)
        {
            st.add(nums[i]);
        }
        int n = nums.length;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i =1;i<=n;i++)
        {
            if(!st.contains(i))
            {
                ans.add(i);
            }
        }
        return ans;
    }
}
