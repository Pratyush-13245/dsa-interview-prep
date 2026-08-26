## Pattern: Boundary + Scanner

**Trigger:** Partition an array in-place based on a condition while preserving relative order.

**Invariant:** `l` marks the boundary of "placed" elements so far; `r` scans forward looking for the next qualifying element.

**Template:**
```java
int l = 0;
for (int r = 0; r < arr.length; r++) {
    if (condition(arr[r])) {
        swap(arr, l, r);
        l++;
    }
}
```

**Problems solved:** LC 283 (Move Zeroes)
