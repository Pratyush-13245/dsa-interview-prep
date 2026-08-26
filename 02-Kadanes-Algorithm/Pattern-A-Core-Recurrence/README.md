## Pattern: Core Kadane's Recurrence

**Trigger:** Contiguous subarray, max/min sum objective, boundaries unknown/variable — local include-or-restart decision at each index.

**Invariant:** `cur` = best sum ending exactly at index i. `best` = best seen anywhere so far. Initialize both to `arr[0]` (not 0) to correctly handle all-negative arrays.

**Template:**
```java
int cur = arr[0], best = arr[0];
for (int i = 1; i < arr.length; i++) {
    cur = Math.max(arr[i], cur + arr[i]);
    best = Math.max(best, cur);
}
```

**Problems solved:** LC 53 (Maximum Subarray)
