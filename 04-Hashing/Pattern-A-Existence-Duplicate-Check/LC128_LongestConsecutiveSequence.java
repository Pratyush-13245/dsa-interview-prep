// LC 128 - Longest Consecutive Sequence
// Pattern: Existence check to find "sequence starts" only, then walk forward
// Trigger: only start a forward-walk when (i - 1) is NOT in the set (true sequence start)
// Bug fixed: must iterate over the HashSet (unique values), not the raw array (nums),
// or duplicates cause repeated O(n) walks from the same starting value -> TLE

class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
        {
            return 0;
        }
        HashSet<Integer> seen = new HashSet<>();
        for(int i:nums) seen.add(i);
        int res =1;
        for(int i : seen)
        {
            int temp =1;
            if(!seen.contains(i-1))
            {
                int j = i;
                while(seen.contains(j+1))
                {
                    j+=1;
                    temp+=1;
                }
            }       
            res = Math.max(res,temp);
        }
        return res;

    }
}
