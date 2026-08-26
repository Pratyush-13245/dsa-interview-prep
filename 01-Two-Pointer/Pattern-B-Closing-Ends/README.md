## Pattern: Closing in From Both Ends

**Trigger:** Sorted array, pair/triplet finding, or maximizing an area/volume between two indices.

**Invariant:** If sum/area with current (l, r) exceeds target, `r` can be permanently abandoned (any larger l' only makes it worse). If below target, `l` can be abandoned.

**Template:**
```java
int l = 0, r = arr.length - 1;
while (l < r) {
    if (condition) { process(); l++; r--; }
    else if (tooSmall) l++;
    else r--;
}
```

**Problems solved:** LC 167 (Two Sum II), LC 11 (Container With Most Water)
