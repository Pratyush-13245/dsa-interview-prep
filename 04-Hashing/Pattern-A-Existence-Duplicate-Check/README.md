## Pattern: Existence / Duplicate Check

**Trigger:** "does X exist," "contains duplicate," "longest consecutive sequence" — anything about seen-before / existence.

**Template:**
```java
Set<Integer> seen = new HashSet<>();
for (int x : arr) {
    if (seen.contains(x)) return true; // or whatever the condition needs
    seen.add(x);
}
```

**Key gotchas learned:**
- When iterating to find "starts" or unique-value-based logic (e.g. Longest Consecutive Sequence), iterate over the **Set**, not the raw array — the raw array can have massive duplicate counts, causing repeated redundant work and TLE even though the algorithm is conceptually O(n).
- Use `HashSet` (not `HashMap`) whenever only *existence* matters, not frequency — simpler and equally correct (e.g. Find All Numbers Disappeared).
- For "nearby duplicate" style constraints (Contains Duplicate II), store the **most recent index** in a HashMap rather than just presence, so each match checks against the closest prior occurrence.
- XOR trick for "find the unpaired element": `x ^ x = 0`, `x ^ 0 = x`, XOR is commutative/associative — XOR-ing the whole array cancels every paired value, leaving only the unpaired one. O(1) space vs O(n) for the hashing approach.
- **In-place negation marking:** when values are constrained to `[1, n]`, the array itself can act as a hashset — negate `nums[val-1]` to mark `val` as "seen," check sign before negating to detect duplicates or find what's missing. O(n) time, O(1) extra space.
- **Floyd's Cycle Detection (slow/fast pointers):** when array values in `[1,n]` over `n+1` slots force a repeated value (pigeonhole), treat `nums[i]` as a "next pointer" — this becomes an implicit linked list with a guaranteed cycle. Same two-phase technique as Linked List Cycle II. Gotcha: don't initialize `slow == fast` before the first loop, or the loop body never executes (TLE) — pre-advance `fast` one hop first.

**Problems solved:**
- LC 217 (Contains Duplicate) — check-before-add, single pass
- LC 128 (Longest Consecutive Sequence) — only walk forward from true sequence starts; iterate over the Set
- LC 219 (Contains Duplicate II) — HashMap storing most recent index, nearby-duplicate constraint
- LC 136 (Single Number) — HashMap frequency approach, plus O(1) space XOR trick
- LC 448 (Find All Numbers Disappeared in an Array) — HashSet existence check over range [1,n]
- LC 287 (Find the Duplicate Number) — Medium — Floyd's Cycle Detection, O(n) time O(1) space, no modification allowed
- LC 442 (Find All Duplicates in an Array) — Medium — in-place negation marking, O(n) time O(1) extra space
