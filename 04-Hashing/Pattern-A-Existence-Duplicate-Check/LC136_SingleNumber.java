// LC 136 - Single Number
// Approach 1: Frequency counting with HashMap - O(n) time, O(n) space
// Approach 2: XOR trick - O(n) time, O(1) space
//   Trigger: x ^ x = 0 (pairs cancel out), x ^ 0 = x (identity), XOR is commutative/associative
//   So XOR-ing every element together leaves only the number with no pair to cancel it

class Solution {
    public int singleNumber(int[] nums) {
        int ans =0;
        for(int i=0;i<nums.length;i++)
        {
            ans = ans^nums[i];
        }
        return ans;
    }
}

/* Approach 1 (HashMap) - for reference:
class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i =0;i<nums.length;i++)
        {
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }   
        int ans =0;
        for(int i : mp.keySet())
        {
            if(mp.get(i) == 1)
            {
                ans = i;
                break;
            }
        }
        return ans;
    }
}
*/
