## Pattern: Fixed-Size Window

**Trigger:** "subarray/substring of size k" — window size is constant.

**Template:**
```java
int windowVal = 0;
for (int i = 0; i < k; i++) windowVal += arr[i]; // or build initial state
int best = windowVal;
for (int r = k; r < arr.length; r++) {
    windowVal += arr[r] - arr[r - k]; // add right, remove left
    best = Math.max(best, windowVal);
}
```

**Problems solved:** LC 2461, LC 219, LC 1456, LC 1876, LC 2090 (all 10 fixed-window problems completed — full list in tracker)

**Status:** ✅ Complete (10/10)
