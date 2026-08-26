## Pattern: Variable-Size Window

**Trigger:** "longest substring...", "minimum window...", contiguous range with a condition, but the window size itself is not fixed.

**Key sub-pattern learned:** "check before, adjust, check after" — check window validity/state, shrink or expand as needed, then re-check.

**Template:**
```java
int l = 0;
Map<Character, Integer> map = new HashMap<>();
for (int r = 0; r < s.length(); r++) {
    map.merge(s.charAt(r), 1, Integer::sum);
    while (invalid(map)) {
        map.merge(s.charAt(l), -1, Integer::sum);
        l++;
    }
    result = Math.max(result, r - l + 1);
}
```

**Problems solved:** none marked done yet
**In progress:** LC 567 (Permutation in String) — paused (picking back up after a break)

**Status:** ⏸️ Paused
