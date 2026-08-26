## Pattern: Kadane's + One Deletion (2-state DP)

**Trigger:** Kadane's-shaped problem but you're allowed to delete exactly one element to potentially improve the sum.

**States:**
- `noDelete[i]` = best subarray sum ending at i with zero deletions used → `= max(arr[i], noDelete[i-1] + arr[i])`
- `oneDelete[i]` = best subarray sum ending at i with exactly one deletion used → `= max(noDelete[i-1], oneDelete[i-1] + arr[i])` (delete arr[i] using noDelete[i-1], OR carry forward a prior deletion)

**Base case:** `noDelete[0] = arr[0]`, `oneDelete[0] = -infinity` (can't delete when there's only one element and still have a subarray)

**Problems solved:** LC 1186 (Maximum Subarray Sum with One Deletion)
