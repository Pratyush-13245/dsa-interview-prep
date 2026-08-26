## Pattern: Dutch National Flag (3-way partition)

**Trigger:** Sort/partition an array into exactly 3 categories in-place, one pass.

**Invariant:** `[0..lo-1]` all category-0, `[lo..mid-1]` all category-1, `[mid..hi]` unprocessed, `[hi+1..n-1]` all category-2. `mid` does NOT advance after swapping with `hi`, since the swapped-in value at `mid` hasn't been classified yet.

**Template:**
```java
int lo = 0, mid = 0, hi = arr.length - 1;
while (mid <= hi) {
    if (arr[mid] == 0) { swap(arr, lo++, mid++); }
    else if (arr[mid] == 1) { mid++; }
    else { swap(arr, mid, hi--); }
}
```

**Problems solved:** LC 75 (Sort Colors)
