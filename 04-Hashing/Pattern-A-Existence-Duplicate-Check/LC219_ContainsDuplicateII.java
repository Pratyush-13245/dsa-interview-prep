// LC 219 - Contains Duplicate II
// Pattern: Existence check with a "recency" constraint
// Trigger: check-before-put, but store INDEX (most recent occurrence), not just presence,
// so each new match compares against the closest prior occurrence

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        
        for(int i =0;i<nums.length;i++)
        {
            int val = nums[i];
            if(mp.containsKey(val) && Math.abs(mp.get(val)-i) <=k)
            {
                return true;
            }
            mp.put(val,i);
        }
        return false;

    }
}
