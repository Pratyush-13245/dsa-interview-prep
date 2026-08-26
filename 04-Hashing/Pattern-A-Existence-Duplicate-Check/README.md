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

**Key gotcha:** when iterating to find "starts" or unique-value-based logic (e.g. Longest Consecutive Sequence), iterate over the **Set**, not the raw array — the raw array can have massive duplicate counts, causing repeated redundant work and TLE even though the algorithm is conceptually O(n).

**Problems solved:**
- LC 217 (Contains Duplicate) — straightforward check-before-add, single pass
- LC 128 (Longest Consecutive Sequence) — only walk forward from true sequence starts (i-1 not in set); iterate over the Set to avoid duplicate-driven TLE
